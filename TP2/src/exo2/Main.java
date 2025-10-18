package exo2;

import java.awt.Color;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        Cartridge yellowCart = new Cartridge(Color.yellow);
        Cartridge pinkCart   = new Cartridge(Color.pink);

        Pen highlighter1 = new Highlighter(yellowCart);
        highlighter1.write("Texte normal");
        highlighter1.changeCartridge(pinkCart);
        highlighter1.write("Texte après changement");
        ((Highlighter) highlighter1).highlight("Important en MAJUSCULES");

        System.out.println("\n--- Disposable ---");
        Cartridge blueCart = new Cartridge(Color.blue);
        Pen disposable = new Disposable(blueCart);
        disposable.write("Bonjour !");
        disposable.changeCartridge(new Cartridge(Color.black));
        disposable.write("On ne peut plus écrire");

        System.out.println("\n--- Retractable ---");
        Cartridge greenCart = new Cartridge(Color.green);
        Retractable retractable = new Retractable(greenCart);
        retractable.write("Avant leadOut");
        retractable.leadOut();
        retractable.write("Après leadOut");
        retractable.leadIn();
        retractable.write("Après leadIn");

        System.out.println("\n--- SwitchPen ---");
        Cartridge redCart = new Cartridge(Color.red);
        SwitchPen switchPen = new SwitchPen(redCart);
        switchPen.write("banana apple apricot", 'a', '*'); // change 'a' en '*'
        switchPen.write("texte par défaut"); // remplace 'a' par '*'

        System.out.println("\n--- MultiColorPen ---");
        Cartridge cart1 = new Cartridge(Color.red);
        Cartridge cart2 = new Cartridge(Color.blue);
        Cartridge cart3 = new Cartridge(Color.black);

        List<Cartridge> carts = Arrays.asList(cart1, cart2, cart3);
        MultiColorPen multiPen = new MultiColorPen(carts);

        multiPen.leadOut();                // sort la mine
        multiPen.selectColor(0);           // rouge
        multiPen.write("Texte rouge");

        multiPen.selectColor(1);           // bleu
        multiPen.write("Texte bleu");

        multiPen.selectColor(2);           // noir
        multiPen.write("Texte noir");

        multiPen.leadIn();                  // rentre la mine
        multiPen.write("Ne doit pas écrire"); // erreur car mine rentrée
    }
}