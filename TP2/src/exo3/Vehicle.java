package exo3;

abstract public class Vehicle {
    private int loc;
    private int speed;
    private final int maxSpeed;
    private boolean isWorking;

    private static final int DEFAULT_LOCALISATION = 0;
    private static final int DEFAULT_SPEED = 0;
    private static final int DEFAULT_MAX_SPEED = 8;
    private static final boolean DEFAULT_STATE = true;

    public Vehicle(){
        this.loc = DEFAULT_LOCALISATION;
        this.speed = DEFAULT_SPEED;
        this.maxSpeed = DEFAULT_MAX_SPEED;
        this.isWorking = DEFAULT_STATE;
    }

    public void accelerate(){
        if (this.speed < this.maxSpeed || this.isWorking){
            this.speed = this.speed + 1;
        }else {
            System.out.println("Its speed is on max or isWorking = " + this.isWorking);;
        }
    }

    public void decelerate(){
        if (this.speed > 0 || this.isWorking){
            this.speed = this.speed - 1;
        }else {
            System.out.println("Its speed is 0 or isWorking = " + this.isWorking);
        }
    }

    public void goToStartingLine(){
        if (this.isWorking){
            this.loc = 0;
            this.speed = 0;
        }
    }

    public void stop(){

    }

    abstract public void specialAction(){

    }

    public int getLoc(){

    }

    public int getSpeed(){

    }

    public void setLoc(){

    }

    public void setSpeed(){

    }


}
