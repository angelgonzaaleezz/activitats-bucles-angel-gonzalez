import java.util.Scanner;

// Activitat 18 — Nombre de xifres


public class NombreDeXifres {
    public static void main(String[] args) {
        // TODO: llegeix un número enter positiu per teclat
        //   divideix-lo successivament entre 10 (prenent la part sencera)
        //   fins obtenir un quocient 0, comptant les divisions fetes amb un comptador
        //   Mostra: "El número <numero> té <xifres> xifres."
        Scanner teclat = new Scanner(System.in);
        System.out.println("Entra un número enter positiu:");
        int numero = teclat.nextInt();
        int xifres = 0;
        int div = numero;
        do {
            div = div / 10;
            xifres++;
        } while (div > 0);
        System.out.println("El número " + numero + " té " + xifres + " xifres.");
    }
}
