package exo3;

import java.util.List;

abstract public class Vehicle {
    private int loc;
    private int speed;
    private final int max_Speed;
    private boolean is_Working;

    private static final int DEFAULT_LOCALISATION = 0;
    private static final int DEFAULT_SPEED = 0;
    private static final boolean DEFAULT_STATE = true;

    public Vehicle(int speedMax){
        this.loc = DEFAULT_LOCALISATION;
        this.speed = DEFAULT_SPEED;
        this.max_Speed = speedMax;
        this.is_Working = DEFAULT_STATE;
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
            System.out.println("”[*]”");
        }
        switch (getClass().getName()){
            case "Car" : System.out.println("[C]");
            case "Tank" : System.out.println("[T]");
            case "Skateboard" : System.out.println("[S]");
        }
    }

    public void goForward(){
        if (this.is_Working){
            this.loc = this.loc + this.speed;
        }
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

    public abstract void specialAction(List<Vehicle> players);

}
