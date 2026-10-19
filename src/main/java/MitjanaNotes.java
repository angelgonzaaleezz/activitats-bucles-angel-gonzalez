// Activitat 22 — Mitjana de notes

import java.util.Scanner;

public class MitjanaNotes {
    public static void main(String[] args) {
        // TODO: 1) llegeix el número d'alumnes (N)
        //   2) amb un bucle, demana la nota de cada alumne i vés acumulant la suma
        //      en una variable (suma = suma + nota)
        //   3) calcula la mitjana dividint la suma entre N
        //   4) mostra: "La mitjana de les notes és: <mitjana>"
        Scanner teclat = new Scanner(System.in);
        System.out.print("Introdueix el número d'alumnes: ");
        int num = teclat.nextInt();
        int suma = 0;
        for (int i = 1; i <= num; i++) {
            System.out.print("Introdueix la nota de l'alumne " + i + ": ");
            int nota = teclat.nextInt();
            suma = suma + nota;
        }
        double mitjana = (double) suma / num;
        System.out.println("La mitjana de les notes és: " + mitjana);
    }
}
