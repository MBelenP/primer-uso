package ejercicioBateriaSegundaParte10;

import java.util.Scanner;

public class EjercicioBateriaSegundaParte10 {

    public static void main(String[] args) {
        /*
        Hacer un programa que pida un número y nos muestre la tabla de multiplicar hasta el numero 10.
         */
        Scanner sc = new Scanner(System.in);
         int i;

         System.out.println("Introduce el número en pantalla que quieras multiplicar");
         int num = sc.nextInt();

        for (i = 0; i < 11; i++) {
            System.out.println(num + "*" + i + " = " + num * i);
        }

    }
}
