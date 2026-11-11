package ejercicioBateria7;

import java.util.Scanner;

public class EjercicioBateria7 {

    public static void main(String[] args) {

        /*
        Algoritmo que pida números mientras que sean más grandes que 100.
        Cuando se introduzca un número menos a 100, para el programa.
         */

        Scanner sc = new Scanner(System.in);
        int num;

        do{
            System.out.println("Introduce un numero");
            num = sc.nextInt();
        }while (num !=100);
        System.out.println("Programa finalizado");
    }
}
