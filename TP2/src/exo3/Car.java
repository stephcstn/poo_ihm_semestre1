package exo3;

public class Car extends Vehicle{
    private static final int DEFAULT_SPEED_MAX = 8;

    public Car(){
        super(DEFAULT_SPEED_MAX);
    }

    @Override
    public void accelerate(){
        super.accelerate();
        super.accelerate();
    }

    @Override
    public void specialAction() {
        this.decelerate();
    }

}
