
import java.util.Random;

// Activitat 11 — Cara o creu, 100 llançaments
public class CaraCreu {
    public static void main(String[] args) {
        // TODO: simula 100 llançaments d'una moneda amb Random (0 = cara, 1 = creu)
        //   comptant quantes vegades surt creu amb una variable que
        //   s'incrementi ella mateixa d'un en un (comptador++)
        //   i calcula les cares com 100 - creus
        //   Mostra: "Cares: X" i "Creus: Y"
    int ca = 0;
    int cr = 0;
    Random random = new Random();
    while (ca + cr < 100) {
        int llançament = random.nextInt(2);
        if (llançament == 0) {
            ca++;
        } else {
            cr++;
        }
    }
    System.out.println("Cares: " + ca);
    System.out.println("Creus: " + cr);

    
    }
}
