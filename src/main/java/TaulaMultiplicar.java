// Activitat 08 — Taula de multiplicar d'un número (per teclat)

import java.util.Scanner;

public class TaulaMultiplicar {
    public static void main(String[] args) {
        // TODO: llegeix un número enter per teclat i, amb un bucle,
        //   mostra la seva taula de multiplicar (de l'1 al 10)
        //   amb el format: "numero × 1 = ...", ..., "numero × 10 = ..."
        Scanner teclat = new Scanner(System.in);
        int i=1;
        int n;
        System.out.println("Introdueix un número enter: ");
        n = teclat.nextInt();
        while (i<=10){
            System.out.println(n + " × " + i + " = " + (n*i));
            i++;
        }
    }
}
