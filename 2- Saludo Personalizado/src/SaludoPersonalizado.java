import java.util.Scanner;
public class SaludoPersonalizado {
    public static void main(String[] args) throws Exception {
        Scanner lector = new Scanner(System.in);
        System.out.print("Escribe tu nombre: ");
        String nombre = lector.nextLine();
        System.out.println();
        System.out.println("Hola " + nombre + ", bienvenido al curso de programacion orientada a objetos.");
        System.out.println();
        lector.close();
    }
}
