package exo3;

import java.util.List;

public class Skateboard extends Vehicle{

    private static final int DEFAULT_SPEED_MAX = 4;

    public Skateboard(){
        super(DEFAULT_SPEED_MAX);
    }

    @Override
    public abstract void specialAction(){
        this.accelerate();
    }
}
