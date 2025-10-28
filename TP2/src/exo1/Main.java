package org.portes;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Door d1 = new Door();
        AutoLockDoor d2 = new AutoLockDoor(true);
        SecretCodeDoor d3 = new SecretCodeDoor(0000);
        ClosedDoor d4 = new ClosedDoor();
        AutoLockDoor d5 = new AutoLockDoor();

        System.out.println("=== (a) une porte verrouillée ne peut pas s’ouvrir ===");
        d2.open();
        
        System.out.println("=== (b) après avoir fermé une porte avec verrou, elle est bien verrouillée et ne peut donc pas s’ouvrir ===");
        d5.unlock();
        d5.open();
        d5.close();
        d5.open();

        System.out.println("=== (c) lorsque l’on tente de déverrouiller une porte à code avec un mauvais code, elle reste verrouillée. ===");
        d3.unlock(53234);
        d3.open();

        System.out.println("=== (d) lorsque l’on tente de déverrouiller une porte à code avec le bon code, elle est bien déverrouillée et peut s’ouvrir. ===");
        d3.unlock(0000);
        d3.open();

        System.out.println("=== (f) si on tente de déverrouiller une une porte à code sans indiquer de code, elle reste verrouillée. ===");
        d3.close();
        d3.unlock();
        d3.open();

        System.out.println("=== (g) une porte condamnée ne peut pas s’ouvrir ===");
        d4.open();

        List<Door> doors = new ArrayList<>();

        doors.add(d1);
        doors.add(d2);
        doors.add(d3);
        doors.add(d4);
        doors.add(d5);

        System.out.println("=== État initial des portes ===");
        Door.printDoorList(doors);

        List<AutoLockDoor> doors_autolock = new ArrayList<>();

        AutoLockDoor d6 = new AutoLockDoor();
        AutoLockDoor d7 = new SecretCodeDoor(123456);
        AutoLockDoor d8 = new AutoLockDoor();
        AutoLockDoor d9 = new SecretCodeDoor(12345);
        AutoLockDoor d10 = new AutoLockDoor();

        doors_autolock.add(d6);
        doors_autolock.add(d7);
        doors_autolock.add(d8);
        doors_autolock.add(d9);
        doors_autolock.add(d10);

        Door.printDoorList(doors_autolock);

    }
}