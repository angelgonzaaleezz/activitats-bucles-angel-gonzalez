import java.util.Locale;
import java.util.Scanner;

// Activitat 26 — Mitjana, nota més gran i nota més petita
public class NotesMitjanaMaxMin {
    public static void main(String[] args) {
        // TODO: 1) llegeix el número d'alumnes (N)
        //   2) llegeix la primera nota i inicialitza amb ella suma, notaMajor i notaMenor
        //   3) amb un bucle, per a la resta d'alumnes: llegeix la nota, acumula-la a
        //      suma, i actualitza notaMajor/notaMenor si cal (comparant-la)
        //   4) calcula la mitjana (suma / N)
        //   5) mostra la mitjana, la nota més gran i la nota més petita
        Locale.setDefault(Locale.US);
        Scanner teclat = new Scanner(System.in);
        System.out.println("Quants alumnes hi ha al grup?");
        int n = teclat.nextInt();
        System.out.println("Entra la nota de l'alumne 1:");
        double nota = teclat.nextDouble();
        double suma = nota;
        double notaMajor = nota;
        double notaMenor = nota;
        for (int i = 2; i <= n; i++) {
            System.out.println("Entra la nota de l'alumne " + i + ":");
            nota = teclat.nextDouble();
            suma = suma + nota;
            if (nota > notaMajor) {
                notaMajor = nota;
            }
            if (nota < notaMenor) {
                notaMenor = nota;
            }
        }
        double mitjana = suma / n;
        System.out.println("La mitjana de les notes és: " + mitjana);
        System.out.println("La nota més gran és: " + notaMajor);
        System.out.println("La nota més petita és: " + notaMenor);
    }
}
