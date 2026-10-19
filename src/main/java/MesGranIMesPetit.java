import java.util.Scanner;

// Activitat 25 — Més gran i més petit


public class MesGranIMesPetit {
    public static void main(String[] args) {
        // TODO: llegeix 20 números per teclat (amb un bucle)
        //   vés comparant cada número llegit amb el "més gran" i el "més petit"
        //   que tinguis fins ara (les primeres variables s'inicialitzen amb el
        //   primer número llegit) i actualitza'ls quan calgui
        //   Mostra: "El número més gran és: <mesGran> i el més petit: <mesPetit>"
        Scanner teclat = new Scanner(System.in);
        System.out.println("Introdueix un número:");
        int numero = teclat.nextInt();
        int mesGran = numero;
        int mesPetit = numero;
        for (int i = 2; i <= 20; i++) {
            System.out.println("Introdueix un número:");
            numero = teclat.nextInt();
            if (numero > mesGran) {
                mesGran = numero;
            }
            if (numero < mesPetit) {
                mesPetit = numero;
            }
        }
        System.out.println("El número més gran és: " + mesGran + " i el més petit: " + mesPetit);
    }
}
