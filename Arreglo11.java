import java.util.*;

public class Arreglo11 {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        int nImpares = 0;
        double nPares = 0;
        int n2Docena = 0;
        int numeroMayor = 0;
        int numero;
        double sumaPares = 0;
        double promedioPares;

        for (int i = 0; i <= 36; i++) {

            System.out.println("Ingrese un numero del 0 al 36");
            numero = teclado.nextInt();
            
            if (numero >= 0 && numero <= 36) {

                if (numero % 2 != 0) {
                    nImpares += 1;
                } else {
                    if (numero > 0 && numero <= 36) {
                        nPares += 1;
                        sumaPares += numero;
                    }
                }

                if (numero >= 13 && numero <= 24) {
                    n2Docena += 1;
                }

                if (numero > numeroMayor){
                    numeroMayor = numero;
                }

            } else {
                System.out.println("Debe ingresar un numero del 0 al 36...");
            }

        }

        promedioPares = sumaPares / nPares;

        System.out.println("Cantidad de numeros impares: "+nImpares);
	    System.out.println("Promedio de numeros pares: "+promedioPares);
	    System.out.println("Cantidad de numeros de la 2da. docena: "+n2Docena);
	    System.out.println("El numero mas grande es: "+numeroMayor);

    }
}