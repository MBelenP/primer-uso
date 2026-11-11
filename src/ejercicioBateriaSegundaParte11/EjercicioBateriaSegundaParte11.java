package ejercicioBateriaSegundaParte11;

import java.util.Scanner;

public class EjercicioBateriaSegundaParte11 {

    public static void main(String[] args){

        /*

        Ej11: Realiza un programa que pida 10 números y cuente los números positivos y
        negativos que se han pasado.

         */

        Scanner sc = new Scanner(System.in);

        int[] listado = new int[10];
        int contpositivos = 0;
        int contnegativos = 0;
        int i;

        for (i = 0; i < 10; i++) {
            System.out.println("Introduce un número en pantalla.");
            listado[i] = sc.nextInt();

        }
        for (i = 0; i < 10; i++) {
            if(listado[i] < 0 ){
                contnegativos++;
            }else contpositivos++;
        }System.out.println ("Se han escrito "+ contpositivos + " numeros positivos y " + contnegativos + " numeros negativos.");


    }



}
