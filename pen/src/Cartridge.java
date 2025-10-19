import java.awt.Color;

public class Cartridge {

    public final static int DEFAULT_LEVEL = 100;
    private int level;
    private Pen pen = null;
    public final Color COLOR;

    public Cartridge(Color c) {
        this.COLOR = c;
        this.level = DEFAULT_LEVEL;
        this.pen = null;
    }

    public void freePen() {
        if (this.pen != null) {
            this.pen = null;
        }
    }

    public void setPen(Pen p) {
        if (p != null) {
            this.pen = p;
        }
    }

    public void use() {
        if (!isEmpty()) {
            this.level--;
        }
    }

    public boolean isEmpty() {
        return this.level <= 0;
    }

    public Pen getPen() {
        return this.pen;
    }

    public int getLevel() {
        return this.level;
    }

    public Color getColor() {
        return this.COLOR;
    }
}

