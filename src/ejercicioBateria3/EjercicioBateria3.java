package ejercicioBateria3;

import java.util.Scanner;

public class EjercicioBateria3 {
    /*
    Ej3: Realiza un programa que pida 10 números por teclado y muestre la suma total.
     */

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int num;
        int totalSuma = 0;
        int cont = 0;

        do {
            System.out.println("Introduce un numero por pantalla");
            num = sc.nextInt();
            totalSuma = totalSuma + num;
            cont++;
            System.out.println(num);
        }while (cont < 10);
        System.out.println("La suma de los numeros introducidos es " + totalSuma);


    }
}
