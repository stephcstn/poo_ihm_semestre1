package exo3;

import java.util.ArrayList;

abstract public class Vehicle {
    private int loc;
    private int speed;
    private final int max_Speed;
    protected boolean is_Working;

    private static final int DEFAULT_LOCALISATION = 0;
    private static final int DEFAULT_SPEED = 0;
    private static final boolean DEFAULT_STATE = true;

    public Vehicle(int speedMax){
        this.loc = DEFAULT_LOCALISATION;
        this.speed = DEFAULT_SPEED;
        this.max_Speed = speedMax;
        this.is_Working = DEFAULT_STATE;
    }

    public void moveForward(){
        if (this.is_Working){
            this.loc = this.loc + this.speed;
        }
    }

    public void accelerate(){
        if (this.is_Working && this.speed < this.max_Speed){
            this.speed++;
        }
    }

    public void decelerate(){
        if (this.is_Working && this.speed > 0){
            this.speed--;
        }
    }

    public void goToStartingLine(){
            this.loc = 0;
            this.speed = 0;
    }

    public void stop(){
            this.speed = 0;
    }

    public void toBeOutOfService(){
            this.stop();
            this.is_Working = false;
    }

    public void printType(){
        if (!this.is_Working){
            System.out.println("[*]");
        }
        switch (getClass().getSimpleName()){
            case "Car" : System.out.println("[C]"); break;
            case "Tank" : System.out.println("[T]"); break;
            case "Skateboard" : System.out.println("[S]"); break;
        }
    }

    public void displayTrajectory() {
        ArrayList<String> tab_traj = new ArrayList<String>();
        for (int i = 0; i < this.loc; i++) {
            tab_traj.add("-");
        }
        System.out.print(tab_traj);
        printType();
    }


    public int getLoc(){
        return this.loc;
    }

    public int getSpeed(){
        return this.speed;
    }

    
    public void setLoc(int loca){
        this.loc = loca;
    }

    public void setSpeed(int sp){
        this.speed = sp;
    }

    public abstract void specialAction(Track track);

}
