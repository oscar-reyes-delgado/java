import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        System.out.print("\nEscribe un numero entero: ");
        int numero = lector.nextInt();
        boolean resultado = esPar(numero);
        if (resultado == true){
            System.out.println("Su numero es par\n");
        }
        else{
            System.out.println("Su numero es impar\n");
        }
        lector.close();
    }

    public static boolean esPar(int numero){
        if ((numero % 2) == 0){
            return true;
        }
        else{
            return false;
        }
    }
}
