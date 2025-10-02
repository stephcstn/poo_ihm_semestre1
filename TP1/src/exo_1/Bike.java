package exo_1;
import java.awt.Color;
import java.lang.reflect.Array;

public class Bike {


    // Constantes
    public static final String DEFAULT_BRAND = "Electra";
    public static final Color DEFAULT_COLOR = Color.red;
    public static final int DEFAULT_SPEED = 0;
    public static final int DEFAULT_SIZE = 26;
    public static final Wheel[] DEFAULT_TAB = {new Wheel(true, "Schalbe", 26), new Wheel(false, "Schalbe", 26)};
    public static final int MAX_SPEED = 60;
    public static final int MIN_SPEED = 0;

    // Attributs privés
    private String brand = DEFAULT_BRAND;
    private Color color = DEFAULT_COLOR;
    private int speed = DEFAULT_SPEED;
    private int size = DEFAULT_SIZE;
    private Wheel[] tab_wheels = DEFAULT_TAB;

   // Constructeur
    public Bike(String brand, int size, Color color) {
        this.color = color;
        this.size = size;
        this.brand = brand;
    }
    // Constructeur par défaut
    public Bike() {
        this.brand = DEFAULT_BRAND;
        this.color = DEFAULT_COLOR;
        this.size = DEFAULT_SIZE;
        this.speed = DEFAULT_SPEED;
        this.tab_wheels = DEFAULT_TAB;
    }

    // Constructeur de copie
    public Bike(Bike autreVelo) {
        this.brand = autreVelo.brand;
        this.color = autreVelo.color;
        this.size = autreVelo.size;
        this.speed = autreVelo.speed;
        this.tab_wheels = autreVelo.tab_wheels;
    }

    // Méthode print
    public void printBike() {
        System.out.println("[" + this.brand + " - " + this.size + "\" - " + this.color + " - (" + this.speed + "km/h)]");
    }

    public void accellerate() {
        if (this.speed < MAX_SPEED) {
            this.speed = this.speed + 1;
        }
    }

    public void brake() {
        if (this.speed > MIN_SPEED) {
            this.speed = this.speed - 1;
        }
    }

    public void repaint(){
        this.color = DEFAULT_COLOR;
    }




    }

