package exo2;

public class Highlighter extends Pen{

    public Highlighter(Cartridge cartridge) {
        super(cartridge);
    }

    public void highlight(String text) {
        if (this.cartridge == null) {
            System.out.println("No cartridge in this pen!");
            return;
        }
        if (this.cartridge.getLevel() > 0) {
            System.out.println("[Highlight color: " + this.cartridge.getColor() + "] " + text.toUpperCase());
            this.cartridge.use();
        } 
    }
}
