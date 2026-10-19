// Activitat 30 — Pedra, paper o tisora, a 3 victòries

import java.util.Scanner;

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
        Scanner scanner = new java.util.Scanner(System.in); 
        while (victoriesUsuari < 3 && victoriesOrdinador < 3) {
            System.out.print("Introdueix la teva jugada (pedra/paper/tisora): ");
            String jugadaUsuari = scanner.nextLine().toLowerCase();
            int jugadaOrdinador = new java.util.Random().nextInt(3);
            String[] opcions = {"pedra", "paper", "tisora"};
            String jugadaOrdinadorStr = opcions[jugadaOrdinador];
            System.out.println("L'ordinador ha triat: " + jugadaOrdinadorStr);
            if (jugadaUsuari.equals(jugadaOrdinadorStr)) {
                System.out.println("Empat!");
            } else if ((jugadaUsuari.equals("pedra") && jugadaOrdinadorStr.equals("tisora")) ||
                       (jugadaUsuari.equals("paper") && jugadaOrdinadorStr.equals("pedra")) ||
                       (jugadaUsuari.equals("tisora") && jugadaOrdinadorStr.equals("paper"))) {
                System.out.println("Has guanyat aquesta ronda!");
                victoriesUsuari++;
            } else {
                System.out.println("L'ordinador ha guanyat aquesta ronda!");
                victoriesOrdinador++;
            }
            System.out.println("Marcador: Usuari " + victoriesUsuari + " - Ordinador " + victoriesOrdinador);
        }
        if (victoriesUsuari == 3) {
            System.out.println("Has guanyat la partida!");
        } else {
            System.out.println("L'ordinador ha guanyat la partida!");   
        }
    }
}
