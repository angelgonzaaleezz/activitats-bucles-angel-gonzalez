import java.util.Random;
import java.util.Scanner;

// Activitat 28 — Endevina el número, 10 intents


public class EndevinaNumero10Intents {
    public static void main(String[] args) {
        // TODO: genera un número aleatori entre 1 i 100 (Random)
        //   amb un bucle while, la condició del qual combini "intents < 10" I
        //   "encara no s'ha encertat":
        //     demana un número, i digues si el número generat és més gran o més
        //     petit que el que ha entrat l'usuari, o si l'ha encertat
        //   Si s'esgoten els 10 intents sense encertar, informa'n l'usuari
        //   (mostrant, per exemple, quin era el número)
        Random random = new Random();
        int numeroAleatori = random.nextInt(100) + 1;
        int intents = 0;
        boolean encertat = false;
        Scanner teclat = new Scanner(System.in);
        System.out.println("Endevina un número que he generat comprès entre 1 i 100");
        while (intents < 10 && !encertat) {
            intents++;
            System.out.print("Entra un número (intent " + intents + "): ");
            int numeroUsuari = teclat.nextInt();
            if (numeroUsuari < numeroAleatori) {
                System.out.println("El número que he generat és més gran que el que has pensat");
            } else if (numeroUsuari > numeroAleatori) {
                System.out.println("El número que he generat és més petit que el que has pensat");
            } else {
                System.out.println("L'has encertat!!");
                encertat = true;
            }
        }
        if (!encertat) {
            System.out.println("No has encertat el número. Era " + numeroAleatori);
        }
    }
}
