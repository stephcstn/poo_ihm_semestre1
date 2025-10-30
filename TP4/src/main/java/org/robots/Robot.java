package org.robots;

import java.util.ArrayList;
import java.util.List;

public class Robot {
    private final String name;
    private boolean state;
    private List<Battery> piles;

    public Robot(String s,Type t, int n_pile, int cap) {
        this.name = s;
        this.state = false;
        this.piles = new ArrayList<Battery>();
        for (int i = 0; i < n_pile ; i++){
            this.piles.add(new Battery(Type.A,20));
        }
    }

    public void switch_battery_AT(Battery b, int pos){
        this.piles.set(pos,b);
    }

    public boolean can_work1(){
        int i = 0;
        if (this.piles.isEmpty()){
            return false;
        }while (this.piles.get(i).getCapacity() == 0 && this.piles.get(i) != null){
            i++;
        }
        return this.piles.get(i) != null;
    }

    public List<Integer>can_work2(){
        List<Integer> res = new ArrayList<Integer>();
        int i = 0;
        while(this.piles.get(i) != null){
            if (this.piles.get(i).getCapacity() == 0){
                res.add(i);
                i++;
            }
            i++;
        }
        return res;
    }

    public void switch_state() {
        if (!this.state) {
            this.state = true;
        }
        this.state = false;
    }

    @Override
    public String toString() {
        int len = this.piles.size();
        if (this.can_work2().size() == this.piles.size()) {
            return "cant work";
        }
        for (int i = 0; i < len; i++) {
            this.piles.get(i).use();
        }
        return "Robot name is " + this.name;
    }

    public boolean get_state(){
        return this.state;
    }

}
