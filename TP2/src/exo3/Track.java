package exo3;

import java.util.ArrayList;

public class Track {
    private final int length;
    private ArrayList<Vehicle> vehicleList;

    public Track(int p_length){
        this.length = p_length;
        this.vehicleList = new ArrayList<Vehicle>();
    }

    public void addVehicle(Vehicle vehicle){
        this.vehicleList.add(vehicle);
    }

    public void initRace(){
        int i;
        for (i = 0; i < vehicleList.toArray().length; i++){
            vehicleList
        }
    }

    public void startRace(){

    }

    public void showRaceState(){

    }

    public boolean isRaceOver(){

    }

    public Vehicle selectTarget(){

    }

    public void chooseForSpecialAction(){

    }
}
