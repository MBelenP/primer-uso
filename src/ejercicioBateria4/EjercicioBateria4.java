package ejercicioBateria4;

import java.util.Scanner;

public class EjercicioBateria4 {

    public static void main(String[] args) {

        /*
        Ej4: Realiza un programa que pida dos números por teclado.
        El programa terminará cuando los dos números sean iguales.
         */

        Scanner sc = new Scanner(System.in);
        int num1;
        int num2;

        do {
            System.out.println("Introduce un número por pantalla");
            num1 = sc.nextInt();
            System.out.println("Introduce un segunto numero por pantalla");
            num2 = sc.nextInt();
        } while (num1 != num2);


        System.out.println("Ambos numeros introducidos son iguales. Su valor es " + num1);
    }
}

