// Activitat 23 — Suma fins a més de 21

import java.util.Scanner;

public class SumaMesDe21 {
    public static void main(String[] args) {
        // TODO: mentre la suma acumulada sigui <= 21:
        //   demana un número enter per teclat
        //   si NO està entre 1 i 5, mostra "El número no és correcte!" (i no el sumis)
        //   si sí que hi està, suma'l a la variable suma
        //   Quan la suma superi 21, mostra:
        //   "Més de 21! La suma dels números entrats és <suma>"
        Scanner teclat = new Scanner(System.in);
        int suma = 0;
        while (suma <= 21) {
            System.out.print("Introdueix un número (entre 1 i 5): ");
            int numero = teclat.nextInt();
            if (numero >= 1 && numero <= 5) {
                suma = suma + numero;
            } else {
                System.out.println("El número no és correcte!");
            }
        }
        System.out.println("Més de 21! La suma dels números entrats és " + suma);
    }
}
