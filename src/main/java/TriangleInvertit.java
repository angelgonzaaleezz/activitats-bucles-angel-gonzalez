// Activitat 36 — Triangle invertit d'asteriscs (bucles encaixats)
public class TriangleInvertit {
    public static void main(String[] args) {
        // TODO: amb dos bucles for encaixats, mostra el triangle invertit
        //   d'asteriscs: la primera fila amb 9 asteriscs, i cada fila següent
        //   amb un asterisc menys, fins arribar a 1
        for (int i = 9; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
