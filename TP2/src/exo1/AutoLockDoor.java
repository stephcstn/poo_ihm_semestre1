package org.portes;

public class AutoLockDoor extends Door{
    public boolean isLocked;
    private final boolean DEFAULT_LOCKED = true;

    public AutoLockDoor() {
        super();
        this.isLocked = DEFAULT_LOCKED;
    }

    public AutoLockDoor(boolean locked){
        super();
        this.isLocked = locked;
    }

    public void unlock() {
            this.isLocked = false;
            System.out.println("Porte deverrouillee avec succès !");
    }

    @Override
    public void open() {
        if (this.isLocked) {
            System.out.println("Impossible d'ouvrir : la porte est verrouillee.");
        } else {
            super.open();
        }
    }

    @Override
    public void close() {
        super.close();
        this.isLocked = true;
        System.out.println("la porte est maintenant verrouillee.");
    }
}
