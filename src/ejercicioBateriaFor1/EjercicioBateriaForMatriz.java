package ejercicioBateriaFor1;

import java.util.Random;
import java.util.Scanner;

public class EjercicioBateriaForMatriz {

    public static void main (String[] args) {
        /*
        Crea una matriz de dimensiones x e y introducidas por el usuario por teclado. Rellena
        la matriz con números aleatorios entre 1 y 10. Introduce un número entre 1 y 10 para que el
        programa lo busque en la matriz y nos diga cuántas veces apareció.
         */
        Scanner sc = new Scanner(System.in);
        Random r= new Random();

        int contador = 0;




        System.out.println ("Introduce el número de filas");
        int fila = sc.nextInt();
        System.out.println("introduce el numero de columnas");
        int columna = sc.nextInt();
        int[][] matriz = new int[fila][columna];

        for (fila = 0;fila < matriz.length; fila++){
            for(columna = 0; columna < matriz[fila].length; columna++){
                matriz[fila][columna] = r.nextInt(0,11);
                System.out.print(matriz[fila][columna] + " ");
            }System.out.println();

        }
        System.out.println("Introduce un numero que quieres buscar entre el 1 y el 10");
        int buscado = sc.nextInt();
        for (fila = 0; fila < matriz.length; fila++){
            for (columna = 0; columna < matriz[fila].length; columna++) {
                if(matriz[fila][columna] == buscado){
                    contador++;

                }

            }
        }
        System.out.println("El número " + buscado + " se ha encontrado " + contador + " veces");




       // System.out.println(matriz.length + " " + (matriz[fila].length -1));
    }
}
