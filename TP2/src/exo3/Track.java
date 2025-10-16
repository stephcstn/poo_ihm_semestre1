package exo3;

import java.util.ArrayList;

public class Track {
    private final int length;
    private List<Vehicle> vehicleList;

    public Track(int p_length){
        this.length = p_length;
        this.vehicleList = new ArrayList<>();
    }

    public void addVehicle(Vehicle v){
        vehicleList.add(v);
    }

    public void initRace() {
        for (int i = 0; i < vehicleList.size(); i++) {
            Vehicle v = vehicleList.get(i);
            v.goToStartingLine();
            System.out.println("Le véhicule " + v.getName() + " est prêt au départ !");
        }
    }

    public void startRace(){

    }

    public void showRaceState(){

    }

    public boolean isRaceOver(){
        for (Vehicle v : vehicleList){
            if (v.getLoc() >= this.length){
                return true;
            }
            return false;
        }
    }

    public Vehicle selectTarget(){

    }

    public void chooseForSpecialAction(){

    }

    public int getLengthList() {
        return this.vehicleList.size();
    }
}
