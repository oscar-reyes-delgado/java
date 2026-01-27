import java.util.Scanner;

public class ejercicio1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] numeros = new int[5];
        boolean encontrado = false;

        // Llenado del arreglo
        for (int i = 0; i < numeros.length; i++) {
            System.out.print("Ingresa un numero: ");
            numeros[i] = sc.nextInt();
        }

        // Pedir el número a buscar
        System.out.print("Numero a buscar: ");
        int buscar = sc.nextInt();

        // Proceso de búsqueda
        for (int i = 0; i < numeros.length; i++) {
            if (numeros[i] == buscar) {
                encontrado = true;
                break;
            }
        }

        // Resultado
        if (encontrado) {
            System.out.println("El numero Si esta en el arreglo");
        } else {
            System.out.println("El numero No esta en el arreglo");
        }
    }
}