import java.util.Scanner;
public class Principal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("\nIngrese el primer numero entero: ");
        int primero = sc.nextInt();

        System.out.print("Ingrese el segundo numero entero: ");
        int segundo = sc.nextInt();

        System.out.println("\nSuma: " + Operaciones.sumar(primero, segundo));
        System.out.println("Resta: "+ Operaciones.restar(primero, segundo));
        System.out.println("Multiplicacion: " + Operaciones.multiplicar(primero, segundo));
    }
}
