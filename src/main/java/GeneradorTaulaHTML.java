import java.util.Scanner;

// Activitat 38 — Generador de taula HTML (bucles encaixats)


public class GeneradorTaulaHTML {
    public static void main(String[] args) {
        // TODO: llegeix el número de files i de columnes per teclat
        //   amb dos bucles for encaixats, genera i mostra per consola el codi HTML
        //   d'una taula on cada cel·la mostri "fila,columna":
        //   <table border='1'>
        //       <tr>
        //           <td>1,1</td>
        //           ...
        //       </tr>
        //       ...
        //   </table>
        Scanner teclat = new Scanner(System.in);
        System.out.println("Entra el número de files:");
        int files = teclat.nextInt();
        System.out.println("Entra el número de columnes:");
        int columnes = teclat.nextInt();
        System.out.println("<table border='1'>");
        for (int fila = 1; fila <= files; fila++) {
            System.out.println("    <tr>");
            for (int columna = 1; columna <= columnes; columna++) {
                System.out.println("        <td>" + fila + "," + columna + "</td>");
            }
            System.out.println("    </tr>");
        }
        System.out.println("</table>");
    }
}
