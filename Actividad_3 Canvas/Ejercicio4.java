import java.util.Scanner;

public class Ejercicio4 {
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        int calificacion = validacion(lector);
        System.out.println("Calificacion valida (" + calificacion + ")\n");
    }

    public static int validacion(Scanner lector){
        int numero;
        while (true){
            System.out.print("Ingrese su calificacion: ");
            try{
                numero = lector.nextInt();
                lector.nextLine();
                if (numero>=0 && numero<=100){
                    return numero;
                }
                else{
                    System.out.println("Calificacion invalida, intente de nuevo\n");
                }
            }
            catch(java.util.InputMismatchException excepcion){
                lector.nextLine();
                System.out.println("Calificacion invalida, intente de nuevo\n");
                return validacion(lector);
            }
        }
    }
}
