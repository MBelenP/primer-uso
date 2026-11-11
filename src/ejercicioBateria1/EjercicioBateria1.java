package ejercicioBateria1;

import java.util.Random;

public class EjercicioBateria1 {

    public static void main(String[] args) {
        /*
        Ej1. Realiza un programa que genere un número aleatorio
        entre 0 y 100 y compruebe si es un número primo.
         */
        Random random = new Random();
        int cont = 0;
        int numero = random.nextInt(100);
        int divisor= numero;

        while(divisor > 0) {
            if(numero % divisor == 0) {
                cont++;

            };
            divisor--;
        }
        if(cont == 2){
            System.out.println("El número " + numero + " es un numero primo");
        }else {
            System.out.println("El número " + numero + " no es un numero primo");
        };

    }
}
