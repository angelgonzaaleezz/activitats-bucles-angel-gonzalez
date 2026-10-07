// Activitat 19 — Taula de multiplicar amb comptador d'errors, amb for

import java.util.Scanner;

public class TaulaMultiplicarErrorsFor {
    public static void main(String[] args) {
        // TODO: igual que l'activitat 13, però implementat fent servir un bucle for.
        //   Llegeix un número per teclat i, amb un for (de l'1 al 10), pregunta la
        //   seva taula de multiplicar: mostra "numero × i = " (amb print, sense
        //   salt de línia), llegeix la resposta i digues "correcte!" o "incorrecte!"
        //   (comptant els errors). Al final: "Has comès X errors!"
        Scanner teclat = new Scanner(System.in);
        int i = 1;
        System.out.print("Introdueix un número per veure la seva taula de multiplicar: ");
        int numero = teclat.nextInt();
        int errors = 0;
        for(i=1; i<=10; i++){
            System.out.print(numero + " × " + i + " = ");
            int resposta = teclat.nextInt();
            if(resposta == numero * i){
                System.out.println("Correcte!");
            } else {
                System.out.println("Incorrecte!");
                errors++;
            }
            
        }
        System.out.println("Has comès " + errors + " errors!");

    }
}
    

