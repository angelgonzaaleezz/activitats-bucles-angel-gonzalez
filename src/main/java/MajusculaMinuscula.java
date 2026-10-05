// Activitat 09 — Majúscula, minúscula o no és una lletra

import java.util.Scanner;

public class MajusculaMinuscula {
    public static void main(String[] args) {
        // TODO: demana 10 cops per teclat un caràcter (amb un bucle) i digues si és
        //   una lletra majúscula, una lletra minúscula, o no és una lletra
        //   Pots comparar el codi Unicode: 'A'..'Z' majúscules, 'a'..'z' minúscules
        Scanner teclat = new Scanner(System.in);
        int i = 1;
        while (i <= 10) {
            System.out.println("Introdueix un caràcter: ");
            char c = teclat.next().charAt(0);
            if (c >= 'A' && c <= 'Z') {
                System.out.println("És una lletra majúscula.");
            } else if (c >= 'a' && c <= 'z') {
                System.out.println("És una lletra minúscula.");
            } else {
                System.out.println("No és una lletra.");
            }
            i++;
        }
    }
}
