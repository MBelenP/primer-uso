package ejercicioBateriaSegundaParte9;

public class EjercicioBateriaSegundaParte9 {

    public static void main(String[] args){
        /*
        Ej9: Realiza un programa que cuente los números del 1 al 50 (ambos incluidos)
        que sean divisibles por 4 y por 5.
         */
        int i;
        int cont = 0;
        for(i=1;i<=50; i++){
            if(i%4 == 0 && i % 5 ==0){
                cont++;
            }
        }System.out.println("Los numeros entre 1 y 50 divisibles entre 4 y 5 son " + cont);

    }
}
