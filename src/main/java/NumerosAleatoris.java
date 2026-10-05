
import java.util.Random;

// Activitat 02 — Números aleatoris
public class NumerosAleatoris {
    public static void main(String[] args) {
        // TODO: genera 50 números aleatoris entre 1 i 15 (tots dos inclosos, amb Random)
        //   i mostra'ls per pantalla, un per línia (amb un bucle)

 Random ran =new Random();
 int i=1;
 int num=0;
 while(i<=50){
    num=ran.nextInt(1,16);
 System.out.println(num);
 i++;
 }



    }
}
