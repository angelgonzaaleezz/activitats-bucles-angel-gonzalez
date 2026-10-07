// Activitat 05 — Hores, minuts i segons, en bucle

import java.util.Scanner;

public class HoresMinutsSegons {
    public static void main(String[] args) {
        // TODO: repeteix 4 vegades (amb un bucle):
        //   demana els segons per teclat i mostra les hores, minuts i segons que representen
        //   Hores  = segons / 3600
        //   Minuts = (segons % 3600) / 60
        //   Segons = segons % 60

int seg;
int ho;
int min;
int nseg;
int i=0;
Scanner teclat= new Scanner(System.in);
while(i<=3){
System.out.println("Introdueix segons: ");
seg= teclat.nextInt();

ho=seg/3600;
min=(seg%3600)/60;
nseg= (seg%3600)%60;


System.out.println("Hores: "+ho);
System.out.println("Minuts: "+min);
System.out.println("Segons: "+nseg);
i++;
}
    }
}
