package exo1;

import java.util.ArrayList;
import java.util.List;

public class Door {

    public boolean isOpen;
    protected final boolean DEFAULT_DOOR = false;


    public Door() {
        this.isOpen = DEFAULT_DOOR;
    }

    public void open() {
        if (!this.isOpen) {
            this.isOpen = true;
            System.out.println("La porte s'ouvre.");
        } else {
            System.out.println("La porte est déjà ouverte.");
        }
    }

    public void close() {
        if (this.isOpen){
            this.isOpen = false;
            System.out.println("La porte se ferme.");
        } else {
            System.out.println("La porte est déjà fermée.");
        }
    }

    @Override
    public String toString() {
        return this.getClass().getSimpleName() + " : " + (this.isOpen ? "ouverte" : "fermée");
    }

    public static void printDoorList(List<? extends Door> doors){
        for (Door d : doors) {
            System.out.println(d.toString());
        }
    }
}

