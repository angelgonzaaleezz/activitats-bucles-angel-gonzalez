import java.util.Locale;
import java.util.Scanner;

// Activitat 01 — Temperatures en bucle
public class TemperaturaBucleN {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner teclat = new Scanner(System.in);
        int i=1;
        System.out.println("Quantes temperatures vols convertir?");
        int n= teclat.nextInt();
        while(i<=n){
            System.out.println("Entra la temperatura:");
            double temp = teclat.nextDouble();
            double t1=((temp-32)*5)/9;
            System.out.println(temp + " °F equivalen a "+ t1 + " °C");
            i++;
        }
    }
}
