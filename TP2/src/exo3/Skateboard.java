package exo3;

public class Skateboard extends Vehicle{

    private static final int DEFAULT_SPEED_MAX = 4;

    public Skateboard(){
        super(DEFAULT_SPEED_MAX);
    }

    @Override
    public void specialAction(Track track) {
        this.accelerate();
    }
}
