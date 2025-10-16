package exo3;

import java.util.Random;

public class Tank extends Vehicle{

    public boolean has_rocket;

    public static final int DEFAULT_SPEED_MAX = 2;
    public static final boolean DEFAULT_HAS_ROCKET = true;  

    public Tank(){
        super(DEFAULT_SPEED_MAX);
        this.has_rocket = DEFAULT_HAS_ROCKET;
    }

    @Override
    public void specialAction(Track track) {
        if (this.has_rocket && this.isWorking){

        int listSize = track.getLengthList();
        if (listSize <= 1) {
            System.out.println("No other vehicles to attack.");
            return;
        }
        Random rand = new Random();
        Vehicle cible = track.getVehicleList().get(rand.nextInt(listSize));

        System.out.println("The tank attacks " + cible.printType());

        if (cible instanceof Car || cible instanceof Skateboard) {
            cible.isWorking = false;
        }

        /*switch (cible.getClass().getSimpleName()){
            case "Car":
            case "Skateboard":
                cible.is_Working = false;
                break;
            case "Tank":
                break;
        } */
        this.stop();
        this.has_rocket = false;
        }
    }
}
