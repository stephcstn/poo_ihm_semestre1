package exo2;

import javax.lang.model.type.NullType;

public class Pen {
    private Cartridge CART;

    public Pen(Cartridge cart){
        this.CART = cart;
        cart.setPen(this);
    }

    public void write(Pen pen, String writing){
        if (pen.CART.getLevel() > 0) {
            System.out.println(writing);
            pen.CART.use();
        }else {
            System.out.println("Pen is empty, please change cartridge");
        }
    }

    public void changeCartridge(Cartridge cart){
        if (cart.getPen() == null) {
            this.CART = cart;
        }else {
            System.out.println("The cartridge is already part of a pen");
        }
    }

}
