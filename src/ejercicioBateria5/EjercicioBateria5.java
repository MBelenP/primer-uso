package ejercicioBateria5;

public class EjercicioBateria5 {

    public static void main(String[] args) {

        /*
        Ej5: Dado un array de números de 6 posiciones con los siguientes valores {11, 9, 7, 5, 3, 1},
        guardar los valores de este array en otro array distinto, pero con los valores invertidos, es decir,
         que el segundo array deberá tener los valores {1, 3, 5, 7, 9, 11}.
         */
        int[] numeros = {11,9,7,5,3,1};
        int[] contrarios = new int[6];
        int i = 0;
        int j = 5;

        while(i < 6 ){
            contrarios[j] = numeros[i];
            i++;
            j--;
        }
        j= 0;
        while( j < 6 ) {
            System.out.println(contrarios[j]);
         j++;
        }




    }
}
