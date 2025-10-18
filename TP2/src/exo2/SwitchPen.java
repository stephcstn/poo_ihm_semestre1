package exo2;

public class SwitchPen extends Pen {
    public SwitchPen(Cartridge cartridge) {
        super(cartridge);
    }

    public void write(String text, char c1, char c2) {
        StringBuilder modified = new StringBuilder();

        for (int i = 0; i < text.length(); i++) {
            char current = text.charAt(i);
            if (current == c1) {
                modified.append(c2);
            } else {
                modified.append(current);
            }
        }

        super.write(modified.toString());
    }
    @Override
    public void write(String text) {
        this.write(text, 'a', '*'); // comportement par défaut
    }


}
