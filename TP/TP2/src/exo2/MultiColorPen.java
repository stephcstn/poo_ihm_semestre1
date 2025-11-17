package exo2;

import java.util.List;
import java.util.ArrayList;
import java.awt.Color;

public class MultiColorPen extends Retractable {
    private final List<Cartridge> cartridges = new ArrayList<>();
    private Cartridge currentCartridge;

    public MultiColorPen(List<Cartridge> cartridges) {
        super(null);
        this.cartridges.addAll(cartridges);
        this.currentCartridge = null;
    }

    public void selectColor(int n_cartridge) {
        if (n_cartridge < 0 || n_cartridge >= cartridges.size()) {
            System.out.println("cartridge out of bounds !");
            return;
        }
        this.currentCartridge = cartridges.get(n_cartridge);
        System.out.println("Color selection : " + currentCartridge.getColor());
    }

    @Override
    public void write(String text) {
        if (this.is_retracted) {
            System.out.println("the lead is retracted !");
            return;
        }
        if (currentCartridge == null) {
            System.out.println("No current cartridge !");
            return;
        }
        if (currentCartridge.isEmpty()) {
            System.out.println("The cartridge is empty !");
            return;
        }

        System.out.println("[Couleur : " + currentCartridge.getColor() + "] " + text);
        currentCartridge.use();
    }
}