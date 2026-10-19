// Activitat 28 — Endevina el número, 10 intents

import java.util.Random;
import java.util.Scanner;

public class EndevinaNumero10Intents {
    public static void main(String[] args) {
        // TODO: genera un número aleatori entre 1 i 100 (Random)
        //   amb un bucle while, la condició del qual combini "intents < 10" I
        //   "encara no s'ha encertat":
        //     demana un número, i digues si el número generat és més gran o més
        //     petit que el que ha entrat l'usuari, o si l'ha encertat
        //   Si s'esgoten els 10 intents sense encertar, informa'n l'usuari
        //   (mostrant, per exemple, quin era el número)
        Random random = new java.util.Random();
        int numeroAleatori = random.nextInt(100) + 1;
        int intents = 0;
        boolean encertat = false;
        Scanner scanner = new Scanner(System.in);
        while (intents < 10 && !encertat) {
            System.out.print("Introdueix un número entre 1 i 100: ");
            int numeroUsuari = scanner.nextInt();
            intents++;
            if (numeroUsuari < numeroAleatori) {
                System.out.println("El número és més gran.");
            } else if (numeroUsuari > numeroAleatori) {
                System.out.println("El número és més petit.");
            } else {    
                System.out.println("Has encertat el número!");
                encertat = true;
            }
        }
        if (!encertat) {
            System.out.println("No has encertat el número. Era " + numeroAleatori);
        }
    }
}
