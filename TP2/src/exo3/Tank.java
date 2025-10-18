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
        if (this.has_rocket && this.is_Working){

        int listSize = track.getLengthList();
        if (listSize <= 1) {
            System.out.println("No other vehicles to attack.");
            return;
        }
        Random rand = new Random();
        Vehicle cible = track.getVehicleList().get(rand.nextInt(listSize));

        while (cible.getClass() == this.getClass()) {
            System.out.println("The tank tried to attack another tank but failed.");
            cible = track.getVehicleList().get(rand.nextInt(listSize));
        }

        System.out.print("The tank attacks ");
        cible.printType();

        if (cible instanceof Car || cible instanceof Skateboard) {
            cible.is_Working = false;
            track.getVehicleList().remove(cible);
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
