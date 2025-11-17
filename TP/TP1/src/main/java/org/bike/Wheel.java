package org.bike;

public class Wheel {
    public static final String DEFAULT_BRAND = "Schalbe";
    public static final int DEFAULT_SIZE = 26;
    public static final float DEFAULT_PRESSURE = 3.0f;

    public final String brand;
    public final int size;
    public float pressure = DEFAULT_PRESSURE;

    public Wheel(int s) {
        this.brand = DEFAULT_BRAND;
        this.size = s;
    }


    public Wheel(String b, int s){
        this.brand = b;
        this.size = s;
    }

    public Wheel(Wheel w){
        this.brand = w.brand;
        this.size = w.size;
        this.pressure = w.pressure;
    }

    public void inflate(){
        this.pressure = this.pressure + 0.1f;
    }

    public void deflate(){
        this.pressure = this.pressure - 0.1f;
    }

    public void print(){
        System.out.println("[" + this.brand +  " - " + this.size + "\" – " + this.pressure +
                "bar]");
    }

    public int getSize(){
        return this.size;
    }

    public String getBrand(){
        return this.brand;
    }

    public float getPressure(){
        return this.pressure;
    }

    @Override
    public String toString() {
        return "[" + this.brand +  " - " + this.size + "\" – " + this.pressure +
                "bar]";
    }


}
