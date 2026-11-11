package ejercicioBateria2;

import java.util.Scanner;

public class EjercicioBateria2 {

    public static void main(String[] args) {
        /*
        Ej2: Realiza un programa  en el que introduciremos números por teclado.
        El programa terminará cuando se introduzca un cero.
         */
        Scanner sc = new Scanner(System.in);

        int num;

        do {
            System.out.println("Por favor, introduce un numero");
            num = sc.nextInt();
        }while(num != 0);
        System.out.println("Programa finalizado");

    }
}
