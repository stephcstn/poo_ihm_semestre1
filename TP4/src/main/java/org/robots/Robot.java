package org.robots;

public class Robot {
    private final String name;
    private boolean state;

    public Robot(String s) {
        this.name = s;
        this.state = false;
    }

    public void switch_state() {
        if (!this.state) {
            this.state = true;
        }
        this.state = false;
    }

    public void to_string(){
        System.out.println("Robot name is " + this.name);
    }
    public boolean get_state(){
        return this.state;
    }

}
