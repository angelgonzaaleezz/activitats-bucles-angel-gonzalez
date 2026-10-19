// Activitat 26 — Mitjana, nota més gran i nota més petita
public class NotesMitjanaMaxMin {
    public static void main(String[] args) {
        // TODO: 1) llegeix el número d'alumnes (N)
        //   2) llegeix la primera nota i inicialitza amb ella suma, notaMajor i notaMenor
        //   3) amb un bucle, per a la resta d'alumnes: llegeix la nota, acumula-la a
        //      suma, i actualitza notaMajor/notaMenor si cal (comparant-la)
        //   4) calcula la mitjana (suma / N)
        //   5) mostra la mitjana, la nota més gran i la nota més petita
        Scanner teclat = new Scanner(System.in);
        System.out.print("Introdueix el número d'alumnes: ");
        int N = teclat.nextInt();
        System.out.print("Introdueix la nota de l'alumne 1: ");
        double nota = teclat.nextDouble();
        double suma = nota;
        double notaMajor = nota;
        double notaMenor = nota;
        for (int i = 2; i <= N; i++) {
            System.out.print("Introdueix la nota de l'alumne " + i  + ": ");
            nota = teclat.nextDouble();
            suma += nota;
            if (nota > notaMajor) {
                notaMajor = nota;
            }
            if (nota < notaMenor) {
                notaMenor = nota;
            }
        }
        double mitjana = suma / N;
        System.out.println("La mitjana és: " + mitjana);
        System.out.println("La nota més gran és: " + notaMajor);
        System.out.println("La nota més petita és: " + notaMenor);
    }
}
