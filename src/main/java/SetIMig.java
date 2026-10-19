import java.util.Locale;
import java.util.Random;
import java.util.Scanner;

// Activitat 29 — El set i mig


public class SetIMig {
    public static void main(String[] args) {
        // TODO: demana l'aposta per teclat
        //   amb un bucle while, la condició del qual combini "total < 7.5" I
        //   "el jugador vol seguir" (condició d'acabament complexa, sense break):
        //     genera una carta aleatòria de l'1 al 10 (8=sota, 9=cavall, 10=rei,
        //     totes valen 0.5; de l'1 al 7 valen el seu número)
        //     suma el seu valor al total i mostra la carta i el total
        //     si el total encara és menor que 7.5, pregunta si vol una altra carta
        //     (si diu que no, deixa de voler seguir)
        //   Quan acabi el bucle, mostra:
        //     "Has Perdut!!!!" si el total supera 7.5
        //     "Has Guanyat <2 x aposta> euros." si el total és exactament 7.5
        //     "El jugador es planta!!!" en cas contrari
        Locale.setDefault(Locale.US);
        Scanner teclat = new Scanner(System.in);
        Random random = new Random();
        System.out.println("Quant vols apostar?");
        double aposta = teclat.nextDouble();
        double total = 0;
        boolean volSeguir = true;
        while (total < 7.5 && volSeguir) {
            int carta = random.nextInt(10) + 1;
            double valorCarta;
            if (carta >= 8) {
                valorCarta = 0.5;
            } else {
                valorCarta = carta;
            }
            total = total + valorCarta;
            if (carta == 8) {
                System.out.println("Has tret una sota (val " + valorCarta + " punts). Portes " + total + " punts.");
            } else if (carta == 9) {
                System.out.println("Has tret un cavall (val " + valorCarta + " punts). Portes " + total + " punts.");
            } else if (carta == 10) {
                System.out.println("Has tret un rei (val " + valorCarta + " punts). Portes " + total + " punts.");
            } else {
                System.out.println("Has tret un " + carta + " (val " + valorCarta + " punts). Portes " + total + " punts.");
            }
            if (total < 7.5) {
                System.out.println("Vols una altra carta? (s/n)");
                String resposta = teclat.next();
                volSeguir = resposta.equalsIgnoreCase("s");
            }
        }
        if (total > 7.5) {
            System.out.println("Has Perdut!!!!");
        } else if (total == 7.5) {
            System.out.println("Has Guanyat " + (2 * aposta) + " euros.");
        } else {
            System.out.println("El jugador es planta!!!");
        }
    }
}
