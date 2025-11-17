package org.example;

public class Pen {

    private Cartridge cartridge = null;
    private final Cap CAP;

    public Pen() {
        this.CAP = new Cap();
    }

    public Pen(String m) {
        this.CAP = new Cap(m);
    }

    public void freeCart() {
        if (this.cartridge != null) {
            this.cartridge.freePen();
            this.cartridge = null;
        }
    }


    public void changeCartridge(Cartridge c) {
        if (this.cartridge != null) {
            this.freeCart();
        }
        if (c != null) {
            if (c.getPen() != null) {
                c.freePen();
            }
            this.cartridge = c;
            this.cartridge.setPen(this);
        } else {
            System.out.println("Cartridge is null");
        }
    }

    public boolean write(String text) {
        if (this.cartridge != null && !this.cartridge.isEmpty()) {
            cartridge.use();
            System.out.println("(e.g. [" + this.cartridge.getColor() + "] : " + text + ")");
            return true;
        }
        System.out.println("Pen is empty or cartridge is not set");
        return false;
    }

    public Cartridge getCartridge() {
        return this.cartridge;
    }

    public String getBrand() {
        return this.CAP.BRAND;
    }

}
