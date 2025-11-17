package exo3;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

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
        }
    }

    public boolean isRaceOver(){
        for (Vehicle v : this.vehicleList){
            if (v.getLoc() >= this.length){
                return true;
            }
        }
        return false;
    }

    public void showRaceState(){
        for (int i = 0; i < vehicleList.size(); i++) {
            Vehicle v = vehicleList.get(i);
            System.out.print(i + " : ");
            v.displayTrajectory();
        }
    }

    public Vehicle selectTarget(){
        List<Vehicle> vehicleList = this.vehicleList;
        int rand = new Random().nextInt(vehicleList.size());
        return vehicleList.get(rand);
    }

    public void chooseForSpecialAction(){
        if (vehicleList.size() > 1) {
            Vehicle cible = selectTarget();
            cible.specialAction(this);
        }
    }

    public void startRace(){
        int i = 0;
        List<Vehicle> v = this.vehicleList;
        while (!isRaceOver()){
            for (i = 0; i < vehicleList.size(); i++) {
                v.get(i).moveForward();
                v.get(i).accelerate();
            }
            showRaceState();
            chooseForSpecialAction();
        }
    }
    
    
    public List<Vehicle> getVehicleList(){
        return this.vehicleList;
    }


    public int getLengthList() {
        return this.vehicleList.size();
    }
}
