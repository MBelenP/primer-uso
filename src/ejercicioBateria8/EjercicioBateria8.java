package ejercicioBateria8;

import java.util.Scanner;

public class EjercicioBateria8 {

    public static void main (String[] args) {

        /*
        Algoritmo que muestre los números entre un número a y un número b (valores dados por el usuario).
         */

        Scanner sc = new Scanner(System.in);
        int num1;
        int num2;
        int numcontador;
        System.out.println("introduce un valor");
        num1= sc.nextInt();
        System.out.println("introduce otro valor");
        num2= sc.nextInt();

        numcontador = num1;
        while(numcontador <= num2) {
            System.out.println(numcontador);
            numcontador++;
        }
        System.out.println("Estos son los números comprendidos entre "+ num1 + " y " +num2);


    }
}
