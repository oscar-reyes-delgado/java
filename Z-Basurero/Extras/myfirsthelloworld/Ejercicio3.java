import java.util.Scanner;
public class Ejercicio3 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int opcion;
        do{
            System.out.println("=============================");
            System.out.println("      Mini calculadora");
            System.out.println("=============================");
            System.out.println("1. Sumar");
            System.out.println("2. Restar");
            System.out.println("3. Salir");
            System.out.println("=============================");
            System.out.print("Ingresa la opcion: ");
            opcion = teclado.nextInt();

            switch(opcion){
                case 1 -> {
                    double suma = sumar(teclado);
                    System.out.println("\nSuma: "+ suma + "\n");
                }
                case 2 -> {
                    double resta = restar(teclado);
                    System.out.println("\nResta: "+ resta + "\n");
                }
                case 3 -> {
                    System.out.println("\nSaliendo de la calculadora\n");
                }
            }
        }while(opcion != 3);
    }

    public static double sumar(Scanner lector){

        System.out.print("\nEscribe el primer numero: ");
        double primero = lector.nextDouble();

        System.out.print("\nEscribe el segundo numero: ");
        double segundo = lector.nextDouble();
        
        return primero + segundo;
    }

    public static double restar(Scanner lector){

        System.out.print("\nEscribe el primer numero: ");
        double primero = lector.nextDouble();

        System.out.print("\nEscribe el segundo numero: ");
        double segundo = lector.nextDouble();
        
        return primero - segundo;
    }
}