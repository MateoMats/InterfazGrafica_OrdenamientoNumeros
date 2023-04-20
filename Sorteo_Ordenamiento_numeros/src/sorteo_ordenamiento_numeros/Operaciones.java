package sorteo_ordenamiento_numeros;
import java.util.Arrays;
import java.util.Scanner;

public class Operaciones {

    public static void main(String[] args) {
          
        Integer[] numeros = new Integer[10];
        Scanner scanner = new Scanner(System.in);
        int indice = 0;

        while (indice < 10) {
            System.out.print("Ingrese un numero aleatorio entre 1-100: ");
            int numero = scanner.nextInt();

            if (numero < 1 || numero > 100) {
                System.out.println("El numero ingresado esta fuera del rango permitido, por favor ingrese otro numero.");
                continue;
            }

            if (numeros[indice] != null) {
                System.out.println("Ya no se pueden ingresar mas numeros.");
                break;
            }

            numeros[indice] = numero;
            indice++;
        }

        for (int i = 0; i < numeros.length - 1; i++) {
            for (int j = 0; j < numeros.length - 1 - i; j++) {
                if (numeros[j] != null && numeros[j+1] != null && numeros[j] > numeros[j+1]) {
                    int temp = numeros[j];
                    numeros[j] = numeros[j+1];
                    numeros[j+1] = temp;
                }
            }
        }

        System.out.println("Los números ordenados son: " + Arrays.toString(numeros));
    }
}
