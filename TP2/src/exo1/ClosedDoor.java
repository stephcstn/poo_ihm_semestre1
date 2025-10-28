package org.portes;

public class ClosedDoor extends Door {

    public ClosedDoor() {
        super();
    }

    @Override
    public void open() {
        System.out.println("Impossible d'ouvrir : porte condamnée !");
    }

    @Override
    public void close() {}
}
