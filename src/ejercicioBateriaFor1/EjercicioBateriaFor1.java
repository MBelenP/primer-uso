package ejercicioBateriaFor1;

import java.util.Random;
import java.util.Scanner;

public class EjercicioBateriaFor1 {

    public static void main(String[] args){
        /*
        Crea una matriz de dimensiones x e y introducidas por el usuario por teclado. Rellena
        la matriz con números aleatorios entre 1 y 10. Introduce un número entre 1 y 10 para que el
        programa lo busque en la matriz y nos diga cuántas veces apareció.
         */
        Scanner sc = new Scanner(System.in);
        Random r = new Random();
        int[] vertical;
        int[] horizontal;
        int i;
        int j;
        int a;
        int numencontrado = 0;

        System.out.println("Indica el numero de columnas que quieres");
        j = sc.nextInt();
        horizontal = new int[j];

        System.out.println("Introduce el número de filas que quieres");
        i = sc.nextInt();
        vertical = new int[i];

        for( i = 0; i < vertical.length; i++){
            for( j=0; j <horizontal.length; j++){
        horizontal[j] = r.nextInt(0,10);
        System.out.print(horizontal[j] + " ");}
            System.out.println();
        }

        System.out.println("introduce un numero entre el 1 y 10");
        a = sc.nextInt();
        for( i = 0; i < vertical.length; i++){
            for( j=0; j <horizontal.length; j++){
                if(horizontal[j] == a && vertical[i] == a) {
                    numencontrado++;

                }
            }

        }System.out.println("El numero buscado es " + a + "y ha sido pintado "+ numencontrado);

    }
}
