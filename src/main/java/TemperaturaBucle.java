import java.util.Locale;
import java.util.Scanner;

// Activitat 01 — Temperatures en bucle
public class TemperaturaBucle {
    public static void main(String[] args) {
        // TODO: demana per teclat 5 temperatures en graus Fahrenheit (una per una, amb un bucle)
        //   i mostra per cadascuna l'equivalent en graus Celsius:
        //   temperatureC = ((temperatureF - 32) * 5) / 9
        Locale.setDefault(Locale.US);
        Scanner teclat = new Scanner(System.in);
        int i=1;
        while(i<=5){
            System.out.println("Introdueix la temperatura en Fahrenheit (" + i + "/5):");
            double temp = teclat.nextDouble();
            double t1=((temp-32)*5)/9;
            System.out.println(temp + " °F equivalen a "+ t1 + " °C");
            i++;
        }
    }
}
