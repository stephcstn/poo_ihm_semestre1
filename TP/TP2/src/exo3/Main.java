package exo3;

public class Main {
    public static void main(String[] args) {
        Track track = new Track(11);

        Vehicle car1 = new Car();
        Vehicle tank1 = new Tank();
        Vehicle tank2 = new Tank();
        Vehicle skateboard1 = new Skateboard();
        Vehicle skateboard2 = new Skateboard();

        track.addVehicle(car1);
        track.addVehicle(tank1);
        track.addVehicle(tank2);
        track.addVehicle(skateboard1);
        track.addVehicle(skateboard2);

        track.initRace();
        track.startRace();
        
    }
}