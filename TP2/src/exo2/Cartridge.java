package exo2;

import java.awt.Color;

public class Cartridge {
    private int level;
    private Color color;
    private Pen pen;

    private final int DEFAULT_LEVEL = 100;

    public Cartridge(Color color){
        this.level = DEFAULT_LEVEL;
        this.color = color;
        this.pen = null;
    }

    public void use(){
        this.level = this.level - 1;
    }

    public int getLevel(){
        return this.level;
    }

    public Color getColor(){
        return this.color;
    }

    public Pen getPen(){
        return this.pen;
    }

    public void setLevel(int Level){
        this.level = Level;
    }
    public void setColor(Color COLOR){
        this.color = COLOR;
    }

    public void setPen(Pen PEN){
        this.pen = PEN;
    }
}
