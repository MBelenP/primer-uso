package ejercicioBateriaSegundaParte3;

import java.util.Random;
import java.util.Scanner;

public class EjercicioBateriaSegundaParte3 {

    public static void main(String[] args) {



        int num = 49;
        int filas;
        int columnas;
    ;

        int[][] matriz = new int[5][5];


            for( filas = 0; filas < matriz.length; filas++) {
                for (columnas = 0; columnas < matriz[filas].length; columnas++) {
                    matriz[filas][columnas] = num;
                    System.out.print(matriz[filas][columnas] + " ");
                    num = num - 2;
                }
                System.out.println();

            }


    }
}


