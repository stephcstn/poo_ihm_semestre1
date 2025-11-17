package org.example;

import java.awt.*;

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
            Pen p = this.pen;
            this.pen = null;
            p.freeCart();
        }
    }

    public void setPen(Pen p) {
        // Si on change de stylo
        if (this.pen != p) {
            // On détache l’ancien stylo, si nécessaire
            if (this.pen != null) {
                Pen oldPen = this.pen;
                this.pen = null;
                oldPen.freeCart();
            }

            // On attache le nouveau stylo
            if (p != null) {
                this.pen = p;
                // Et on met à jour le stylo pour qu’il connaisse cette cartouche
                if (p.getCartridge() != this) {
                    p.changeCartridge(this);
                }
            }
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

