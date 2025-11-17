package org.bike;

import java.awt.Color;

public class Bike {

    private static final String DEFAULT_BRAND = "Electra";
    private static final Color DEFAULT_COLOR = Color.red;
    private static final int DEFAULT_SIZE = 26;
    public static final int MAX_SPEED = 60;
    public static final int MIN_SPEED = 0;
    public static final int N_ROUES = 2;

    public final String brand;
    public Color color;
    public int speed;
    public final int size;
    public Wheel[] tab_wheels;

    public Bike(){
        this.brand = DEFAULT_BRAND;
        this.color = DEFAULT_COLOR;
        this.speed = 0;
        this.size = DEFAULT_SIZE;
        this.tab_wheels = new Wheel[N_ROUES];
        this.tab_wheels[0] = new Wheel(this.size-1);
        this.tab_wheels[1] = new Wheel(this.size+1);
    }

    public Bike(String bb, int sb, Color c, String bw){
        this.brand = bb;
        this.color = c;
        this.speed = 0;
        this.size = sb;
        this.tab_wheels = new Wheel[N_ROUES];
        this.tab_wheels[0] = new Wheel(bw,this.size-1);
        this.tab_wheels[1] = new Wheel(bw,this.size+1);
    }

    public Bike(Bike V){
        this.brand = V.brand;
        this.color = V.color;
        this.speed = V.speed;
        this.size = V.size;
        this.tab_wheels = new Wheel[V.tab_wheels.length];
        for (int i = 0; i < V.tab_wheels.length; i++){
            this.tab_wheels[i] = new Wheel(V.tab_wheels[i]);
        }
    }

    public void print(){
        System.out.println("[" + this.brand + " - " + this.size + "\" - " +
                this.color + " - (" + this.speed + "km/h)]");
        System.out.println("— Front Wheel:[" + this.tab_wheels[0].getBrand() + " -  " +
                this.tab_wheels[0].getSize() +  "\" – " + this.tab_wheels[0].getPressure() + "bar]");
        System.out.println("— Rear Wheel:[" + this.tab_wheels[1].getBrand() + " -  " +
                this.tab_wheels[1].getSize() +  "\" – " + this.tab_wheels[1].getPressure() + "bar]");
    }

    public void accelerate(){
        if (this.speed <= MAX_SPEED){
            this.speed ++;
        }
    }

    public void brake(){
        if (this.speed > MIN_SPEED){
            this.speed --;
        }
    }

    public void repaint(){
        this.color = DEFAULT_COLOR;
    }

    public void deleteWheel(int i){
        this.tab_wheels[i] = null;
    }

    public void changeWheel(int i, Wheel w){
        if (w.getSize() - this.size < 2 && w.getSize() - this.size > -2) {
            deleteWheel(i);
            this.tab_wheels[i] = w;
        }
    }

    public void switchWheels(){
        Wheel tmp = this.tab_wheels[0];
        this.tab_wheels[0] = this.tab_wheels[1];
        this.tab_wheels[1] = tmp;
    }

    public void numberOfWheels(){
        int taille = 0;
        for (Wheel w : this.tab_wheels){
            if (w != null){
                taille ++;
            }
        }
        System.out.println("Nombre de roues: " + taille);
    }
}
