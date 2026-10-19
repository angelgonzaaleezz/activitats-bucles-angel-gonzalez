import java.util.Locale;
import java.util.Scanner;

// Activitat 22 — Mitjana de notes


public class MitjanaNotes {
    public static void main(String[] args) {
        // TODO: 1) llegeix el número d'alumnes (N)
        //   2) amb un bucle, demana la nota de cada alumne i vés acumulant la suma
        //      en una variable (suma = suma + nota)
        //   3) calcula la mitjana dividint la suma entre N
        //   4) mostra: "La mitjana de les notes és: <mitjana>"
        Locale.setDefault(Locale.US);
        Scanner teclat = new Scanner(System.in);
        System.out.println("Quants alumnes hi ha al grup?");
        int num = teclat.nextInt();
        double suma = 0;
        for (int i = 1; i <= num; i++) {
            System.out.println("Entra la nota de l'alumne " + i + ":");
            double nota = teclat.nextDouble();
            suma = suma + nota;
        }
        double mitjana = suma / num;
        System.out.println("La mitjana de les notes és: " + mitjana);
    }
}
