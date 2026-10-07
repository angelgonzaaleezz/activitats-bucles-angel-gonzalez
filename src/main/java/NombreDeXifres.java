// Activitat 18 — Nombre de xifres

import java.util.Scanner;

public class NombreDeXifres {
    public static void main(String[] args) {
        // TODO: llegeix un número enter positiu per teclat
        //   divideix-lo successivament entre 10 (prenent la part sencera)
        //   fins obtenir un quocient 0, comptant les divisions fetes amb un comptador
        //   Mostra: "El número <numero> té <xifres> xifres."
        Scanner teclat = new Scanner(System.in);
        System.out.print("Introdueix un número enter positiu: ");
        int numero = teclat.nextInt();
        int xifres = 0;
        int div = numero;
        while (div > 0) {
            div /= 10;
            xifres++;   
        }
        System.out.println("El número " + numero + " té " + xifres + " xifres.");
    }
}
