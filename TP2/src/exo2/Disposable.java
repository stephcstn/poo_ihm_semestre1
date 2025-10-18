package exo2;

public class Disposable extends Pen {
    private boolean usable = true;

    public Disposable(Cartridge cartridge) {
        super(cartridge);
    }

    @Override
    public void write(String text) {
        if (!usable) {
            System.out.println("Le stylo jetable est inutilisable !");
            return;
        }

        if (cartridge == null || cartridge.isEmpty()) {
            System.out.println("Le stylo jetable n’a plus d’encre !");
            usable = false;
            return;
        }

        System.out.println("[Ink color: " + this.cartridge.getColor() + "] " + text);
        this.cartridge.use();
    }

    @Override
    public void changeCartridge(Cartridge newCartridge) {
        System.out.println("Impossible de remplacer la cartouche d’un stylo jetable !");
        if (cartridge != null) {
            cartridge.setLevel(0);
            usable = false;
        }
    }
}