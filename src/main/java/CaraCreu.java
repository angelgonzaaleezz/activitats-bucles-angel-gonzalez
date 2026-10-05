
import java.util.Random;

// Activitat 11 — Cara o creu, 100 llançaments
public class CaraCreu {
    public static void main(String[] args) {
        // TODO: simula 100 llançaments d'una moneda amb Random (0 = cara, 1 = creu)
        //   comptant quantes vegades surt creu amb una variable que
        //   s'incrementi ella mateixa d'un en un (comptador++)
        //   i calcula les cares com 100 - creus
        //   Mostra: "Cares: X" i "Creus: Y"
    
     //Inicialitzem un comptador
    int i = 0;
    Random num= new Random();
    int ran=num.nextInt(0,3);
    //Ja hem fet això 100 cops?
    while (true) {
        ran=num.nextInt(0,2);
       if(ran==0){
        System.out.print("0");
       }
       else{
        System.out.print("1");
        Thread.sleep(1000);
       }
       //Ho hem fet un cop, sumem 1 al comptador
   
    }
    //Forcem un salt de línia

    
    
    
    
    }
}
