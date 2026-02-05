import java.util.Scanner;
public class Ejercicio5 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("===========================");
        System.out.println("   Registro de ventas");
        System.out.println("===========================");

        int numeroVentas = validacionInt(teclado);
        double total = totalVendido(teclado, numeroVentas);
        double promedio = promedio(numeroVentas, total);

        System.out.println("===========================");
        System.out.println("   Registro de ventas");
        System.out.println("===========================");
        System.out.println("Total vendido: $"+ total);
        System.out.println("Promedio: "+ promedio);
        System.out.println("Numero de ventas: "+ numeroVentas);
        System.out.println("\nFin del programa");
    }

    public static int validacionInt(Scanner lector){
        try{
            System.out.print("Cuantas ventas desea registrar: ");
            int numero = lector.nextInt();
            if (numero>0){
                return numero;
            }else{
                System.out.println("Numero invalido, intente de nuevo\n");
                return validacionInt(lector);
            }
        }catch(java.util.InputMismatchException excepcion){
            System.out.println("Numero invalido, intente de nuevo\n");
            lector.nextLine();
            return validacionInt(lector);
        }
    }

    public static double validacionSuma(Scanner lector){
        try{
            System.out.print("Ingresa el monto vendido: $");
            double numero = lector.nextDouble();
            if (numero>0){
                return numero;
            }else{
                System.out.println("Numero invalido, intente de nuevo\n");
                return validacionSuma(lector);
            }
        }catch(java.util.InputMismatchException excepcion){
            System.out.println("Numero invalido, intente de nuevo\n");
            lector.nextLine();
            return validacionSuma(lector);
        }
    }

    public static double totalVendido(Scanner lector, int ventas){
        double suma = 0;
        for (int i = 1; i <= ventas; i++){
            System.out.println("\nVenta numero "+ i);
            suma += validacionSuma(lector);
        }
        return suma;
    }

    public static double promedio(int ventas, double total){
        return total/ventas;
    }
}
