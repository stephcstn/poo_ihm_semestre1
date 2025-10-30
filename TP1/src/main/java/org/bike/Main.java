package org.bike;

import java.awt.Color;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Main {
    static void main() {
        Bike b1 = new Bike("BMW",28, Color.pink,"Michelin");
        Bike b2 = new Bike();
        Bike b3 = new Bike(b1);

        Wheel w1 = new Wheel("Michelin",28);
        Wheel w2 = new Wheel("Springle",26);
        Wheel w3 = new Wheel("Coca",24);
        Wheel w4 = new Wheel("Sweppes",22);

        List<Wheel> wlist = new ArrayList<>();
        wlist.add(w1);
        wlist.add(w2);
        wlist.add(w3);
        wlist.add(2,w4);
        wlist.add(w4);
        System.out.println("Affichez le nombre d’éléments que contient la liste: " + wlist.toArray().length);
        System.out.println(wlist);

        Set<Wheel> wset = new HashSet<>();
        wset.add(w1);
        wset.add(w2);
        wset.add(w3);
        System.out.println("HashSet:");
        System.out.println(wset);

        b1.print();
        b2.print();
        b3.print();

        b1.accelerate();
        b1.accelerate();
        b1.accelerate();
        b1.print();
        b3.print();
        b1.brake();
        b1.print();
        b2.print();

        b1.numberOfWheels();

    }
}
