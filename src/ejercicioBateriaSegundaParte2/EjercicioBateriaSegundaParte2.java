package ejercicioBateriaSegundaParte2;

import java.util.Random;
import java.util.Scanner;

public class EjercicioBateriaSegundaParte2 {
    public static void main(String[] args) {

    /*
    Pide al usuario un número de filas y columnas y genera una matriz con números pares
    ordenados de menor a mayor.
     */

        Scanner sc = new Scanner(System.in);
        Random r = new Random();

        int[] filas;
        int[] columnas;
        int i;
        int j;
        int num= 0;

        System.out.println("Introduce el numero de columnas");
        i = sc.nextInt();
        columnas = new int[i];

        System.out.println("Introduce el numero de filas");
        j = sc.nextInt();
        filas = new int[j];

        for( i = 0; i < filas.length; i++) {
            for (j = 0; j < columnas.length; j++) {
                columnas[j] = num;
                System.out.print(columnas[j] + " ");
                num = num + 2;
            }
            System.out.println();


        }
    }
}
