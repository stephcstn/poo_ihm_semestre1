package exo_1;

import java.awt.*;

public class Main {
    public static void main(String[] args){
        Bike velo1 = new Bike("bmw",26,Color.black);
        velo1.printBike();

        Bike b1 = new Bike();
        Bike b2 = new Bike(velo1);
        b1.printBike();
        b2.printBike();
        b1.accellerate();
        b1.accellerate();
        b1.accellerate();
        b1.printBike();
        b1.brake();
        b1.printBike();
        b2.accellerate();
        b2.accellerate();
        b2.accellerate();
        b2.accellerate();

        b1=b2;
        b1.printBike();
        b2.printBike();

        Wheel roue1 = new Wheel();
        roue1.printWheel();
    }
}