package exo2;

import java.awt.Color;

public class Cartridge {
    private Color color;
    private int level;
    private Pen pen;

    private final int DEFAULT_LEVEL = 10;

    public Cartridge(Color color) {
        this.color = color;
        this.level = DEFAULT_LEVEL;
        this.pen = null;
    }

    public boolean isEmpty() {return this.level == 0;}

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

    public void setLevel(int level) {this.level = level;}

    public void detach() {
        this.pen = null;
    }

    public void use() {
            this.level--;
        }

    public void refill() {
        this.level = 100;
    }

    public boolean isAttached() {
        return this.pen != null;
    }
}

