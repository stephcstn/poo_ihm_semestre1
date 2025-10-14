package exo2;

public class Highlighter extends Pen{

    public Highlighter(String texte) {
        texte = texte.toUpperCase();
    }

    public void write(Pen pen, String writing){
        super.write();
    }
}
