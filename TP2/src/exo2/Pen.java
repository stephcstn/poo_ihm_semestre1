package exo2;

public abstract class Pen {
    protected Cartridge cartridge;

    public Pen(Cartridge cartridge) {
        if (cartridge.isAttached()) {
            System.out.println("Cartridge already attached to another pen!");
        } else {
            this.cartridge = cartridge;
            cartridge.setPen(this);
        }
    }


    public void changeCartridge(Cartridge newCartridge) {
        if (this.cartridge != null) {
            this.cartridge.detach();
        }
        if (newCartridge.isAttached()) {
            System.out.println("This cartridge is already used in another pen!");
            return;
        }
        this.cartridge = newCartridge;
        newCartridge.setPen(this);
    }

    public void write(String text) {
        if (this.cartridge == null) {
            System.out.println("No cartridge in this pen!");
            return;
        }
        if (this.cartridge.getLevel() > 0) {
            System.out.println("[Ink color: " + this.cartridge.getColor() + "] " + text);
            this.cartridge.use();
        } 
    }

}

