package exo2;

public class Retractable extends Pen {
    protected boolean is_retracted;

    private static final boolean DEFAULT_MINE = true;

    public Retractable(Cartridge cartridge) {
        super(cartridge);
        this.is_retracted = DEFAULT_MINE;
    }

    public void leadIn(){
        this.is_retracted = true;
    }

    public void leadOut(){
        this.is_retracted = false;
    }

    public boolean isRetracted() {return this.is_retracted;}


    @Override
    public void write(String text) {
        if (!this.is_retracted) {
            super.write(text);
        }
    }
}
