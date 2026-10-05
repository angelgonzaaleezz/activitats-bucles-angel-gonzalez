
import java.util.Scanner;

// Activitat 01 — Temperatures en bucle
public class TemperaturaBucleN {
    public static void main(String[] args) {
        
        Scanner teclat = new Scanner(System.in);
        int i=1;
        System.out.println("Introdueix quantes temperatures vols mesurar:");
        int n= teclat.nextInt();
        while(i<=n){
            System.out.println("Introdueix temperatura numero " + i + " en graus farenheit:");
            double temp = teclat.nextDouble();
            double t1=((temp-32)*5)/9;
            System.out.println(temp + " graus farenheit son "+ t1 + " graus celsius!");
            i++;
        }

    }
}
