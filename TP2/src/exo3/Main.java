package exo3;

public class Main {
    public static void main(String[] args) {
        Track track = new Track(20);

        Vehicle car1 = new Car();
        Vehicle skateboard1 = new Skateboard();
        Vehicle tank1 = new Tank();

        track.addVehicle(car1);
        track.addVehicle(skateboard1);
        track.addVehicle(tank1);   

        track.initRace();
        track.startRace();
        
    }
}