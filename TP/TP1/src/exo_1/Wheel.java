package exo_1;

public class Wheel {
    public static final String DEFAULT_BRAND = "Schalbe";
    public static final int DEFAULT_SIZE = 24;
    public static final float DEFAULT_PRESSURE = 3.0f;

    private String brand = DEFAULT_BRAND;
    private int size = DEFAULT_SIZE;
    private float pressure = DEFAULT_PRESSURE;

    public Wheel(boolean roue_avant,String brand, int size) {
        this.brand = brand;
        if (roue_avant = true){
            this.size = size+1;
        }
        this.size = size-1;
    }

    public void printWheel(){
        System.out.println("[" + brand + " - " + size + "\" - " + pressure + " bar]");
    }



}
