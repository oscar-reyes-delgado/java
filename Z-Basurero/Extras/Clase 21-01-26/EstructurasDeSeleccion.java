import java.util.Scanner;
public class EstructurasDeSeleccion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese su edad: ");
        int edad = sc.nextInt();
        System.out.print("Ingrese su altura en cm: ");
        double altura = sc.nextDouble();
        sc.close();
        
        if ((edad >= 18) && (altura >= 160)){
            System.out.println("Acceso permitido");
        }
        else{
            System.out.println("Acceso denegado");
        }
    }
}
