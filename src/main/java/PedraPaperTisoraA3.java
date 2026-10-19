import java.util.Random;
import java.util.Scanner;

// Activitat 30 — Pedra, paper o tisora, a 3 victòries


public class PedraPaperTisoraA3 {
    public static void main(String[] args) {
        // TODO: amb un bucle while, la condició del qual combini "l'ordinador té
        //   menys de 3 victòries" I "l'usuari té menys de 3 victòries" (condició
        //   d'acabament complexa, sense break):
        //     demana la jugada de l'usuari (pedra/paper/tisora)
        //     genera la jugada de l'ordinador (Random: 0=pedra, 1=paper, 2=tisora)
        //     decideix qui guanya la ronda (o si empaten) i actualitza els
        //     comptadors de victòries
        //     mostra el resultat de la ronda i el marcador
        //   Quan acabi el bucle (algú ha arribat a 3 victòries), mostra qui ha
        //   guanyat la partida
        int victoriesUsuari = 0;
        int victoriesOrdinador = 0;
        Scanner teclat = new Scanner(System.in);
        Random random = new Random();
        while (victoriesUsuari < 3 && victoriesOrdinador < 3) {
            System.out.println("Entra pedra, paper o tisora:");
            String jugadaUsuari = teclat.next().toLowerCase();
            if (!jugadaUsuari.equals("pedra") && !jugadaUsuari.equals("paper") && !jugadaUsuari.equals("tisora")) {
                System.out.println("Jugada no vàlida!");
            } else {
                int atzar = random.nextInt(3);
                String jugadaOrdinador;
                if (atzar == 0) {
                    jugadaOrdinador = "pedra";
                } else if (atzar == 1) {
                    jugadaOrdinador = "paper";
                } else {
                    jugadaOrdinador = "tisora";
                }
                System.out.println("Ordinador ha tret: " + jugadaOrdinador);
                if (jugadaUsuari.equals(jugadaOrdinador)) {
                    System.out.println("Heu empatat!! Ordinador: " + victoriesOrdinador + " , tú: " + victoriesUsuari);
                } else if ((jugadaUsuari.equals("pedra") && jugadaOrdinador.equals("tisora")) ||
                           (jugadaUsuari.equals("paper") && jugadaOrdinador.equals("pedra")) ||
                           (jugadaUsuari.equals("tisora") && jugadaOrdinador.equals("paper"))) {
                    victoriesUsuari++;
                    System.out.println("Has guanyat! Ordinador: " + victoriesOrdinador + " , tú: " + victoriesUsuari);
                } else {
                    victoriesOrdinador++;
                    System.out.println("Has perdut! Ordinador: " + victoriesOrdinador + " , tú: " + victoriesUsuari);
                }
            }
        }
        if (victoriesUsuari == 3) {
            System.out.println("Has guanyat la partida!");
        } else {
            System.out.println("L'ordinador ha guanyat la partida!");
        }
    }
}
