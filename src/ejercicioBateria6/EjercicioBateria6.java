package ejercicioBateria6;

import java.util.Random;
import java.util.Scanner;

public class EjercicioBateria6 {


    public static void main(String[] args) {
        /*
        Ej6: Realiza un programa que cree un array de números de un tamaño que decidirá el usuario usando
        del teclado, el array contendrá 30 números aleatorios  y nos indicará cual es el mayor de todos.
         */

        Scanner sc = new Scanner(System.in);
        Random random = new Random();
        int i=0;
        int[] array;
        int mayor;

        System.out.println("Introduce el tamaño del array");
        i = sc.nextInt();
        array= new int[i];
        while(i > 0){
            i = i - 1;
            array[i]= random.nextInt(30);
            System.out.println(array[i]);
        }
        i = 0;
        System.out.println(array.length);
        mayor = array[i];
        i++;

        while(i< array.length) {
            if (mayor < array[i]) {
                mayor = array[i];
                i++;
            }else i++;
        }System.out.println ("El número mayor es " + mayor);
        System.out.println(array.length);







    }
}

