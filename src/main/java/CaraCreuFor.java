// Activitat 20 — Cara o creu, 100 llançaments, amb for

import java.util.Random;

public class CaraCreuFor {
    public static void main(String[] args) {
        // TODO: igual que l'activitat 11, però implementat fent servir un bucle for.
        //   Simula 100 llançaments d'una moneda amb Random (0 = cara, 1 = creu)
        //   comptant quantes vegades surt creu amb un comptador (comptador++)
        //   i calcula les cares com 100 - creus
        //   Mostra: "Cares: X" i "Creus: Y"
 int ca = 0;
    int cr = 0;
    Random random = new Random();
    for (int i=0; i<100; i++) {
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