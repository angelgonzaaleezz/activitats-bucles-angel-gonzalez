// Activitat 34 — Triangle d'asteriscs (bucles encaixats)
public class TriangleAsteriscs {
    public static void main(String[] args) {
        // TODO: igual que l'activitat 33, però mostrant asteriscs en lloc de
        //   números: "*", "* *", "* * *", ... fins a 9 asteriscs a l'última fila
        for (int i = 1; i <= 9; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
