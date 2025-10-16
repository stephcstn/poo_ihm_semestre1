package exo2;

import java.awt.Color;

public class Cartridge {
    private Color color;
    private int level;
    private Pen pen;

    private final int DEFAULT_LEVEL = 100;

    public Cartridge(Color color) {
        this.color = color;
        this.level = DEFAULT_LEVEL;
        this.pen = null;
    }

    public Color getColor() {
        return this.color;
    }

    public int getLevel() {
        return this.level;
    }

    public Pen getPen() {
        return this.pen;
    }

    public void setPen(Pen pen) {
        this.pen = pen;
    }

    public void detach() {
        this.pen = null;
    }

    public void use(int amount) {
        if (this.level >= amount) {
            this.level -= amount;
        }
    }

    public void refill() {
        this.level = 100;
    }

    public boolean isAttached() {
        return this.pen != null;
    }
}

