package exo1;

public class Main {
    public static void main(String[] args) {
       Door d1 = new Door();
       Door d2 = new AutoLockDoor(true);
       Door d3 = new SecretCodeDoor();
       Door d4 = new ClosedDoor();

       d2.open();

    }
}