// Activitat 10 — Números de N fins a 1

import java.util.Scanner;

public class NumerosDeNa1 {
    public static void main(String[] args) {
        // TODO: llegeix un número enter N per teclat
        //   i mostra, amb un bucle, tots els números des de N fins a 1 (un per línia)
        Scanner teclat = new Scanner(System.in);
        int n;
        System.out.println("Introdueix un número enter: ");
        n = teclat.nextInt();
        while (n>=1){
            System.out.println(n);
            n--;    
        }
    }
}
