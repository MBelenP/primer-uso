package ejercicioBateriaSegundaParte2;

import java.util.Random;
import java.util.Scanner;

public class EjercicioBateriaSegundaParte2Bis {

    public static void main(String[] args) {

    /*
    Pide al usuario un número de filas y columnas y genera una matriz con números pares
    ordenados de menor a mayor.
     */

        Scanner sc = new Scanner(System.in);
        Random r = new Random();

        int num = 0;

        System.out.println("Introduce el numero de filas");
        int filas = sc.nextInt();

        System.out.println("Introduce el numero de columnas");
        int columnas = sc.nextInt();

        int[][] matriz = new int[filas][columnas];


        for( filas = 0; filas < matriz.length; filas++) {
            for (columnas = 0; columnas < matriz[filas].length; columnas++) {
                matriz[filas][columnas] = num;
                System.out.print(matriz[filas][columnas] + " ");
                num = num + 2;
            }System.out.println();



        }
    }
}
