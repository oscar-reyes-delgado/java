import java.util.Scanner;

public class Factorial {
    /* Metodo recursivo:
    - Se llama a si mismo
    - Debe tener un caso base para evitar una llamada infinita 
    - Debe tener una condicion de parada para evitar llamadas infinitas */    
    
    public static int calcularFactorial(int n) {
        // Condicion de parada
        if (n == 0) {
            return 1; // El factorial de 0 es 1
        }
        // El metodo se vuelve aa llamar con un valor menor
        return n * calcularFactorial(n - 1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese un numero para calcular su factorial: ");
        int numero = sc.nextInt();

        System.out.println("El factorial de " + numero + " es: " + calcularFactorial(numero));
    }
}
