// Activitat 12 — Comptar parells i senars, aleatoris

import java.util.Random;
import java.util.Scanner;

public class ParellsISenarsAleatoris {
    public static void main(String[] args) {
        // TODO: demana quants números vol generar l'usuari (N)
        //   genera N números aleatoris (per exemple, entre 1 i 100, amb Random)
        //   compta'n quants són parells (numero % 2 == 0) amb un comptador
        //   i calcula els senars com N - parells
        //   Mostra: "Han sortit X números parells i Y senars"
        Scanner teclat = new Scanner(System.in);
        Random random = new Random();
        int n;
        int parells = 0;
        int senars = 0;
        System.out.println("Introdueix quants números vols generar: ");
        n = teclat.nextInt();
        while (parells + senars < n) {
            int numero = random.nextInt(100) + 1;
            if (numero % 2 == 0) {
                parells++;
            } else {
                senars++;
            }
        }
        System.out.println("Han sortit " + parells + " números parells i " + senars + " senars");
    }
}
