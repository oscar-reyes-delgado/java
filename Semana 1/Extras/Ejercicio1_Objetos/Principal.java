import java.util.Scanner;

public class Principal {
    
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);

        System.out.println();
        System.out.print("Ingrese su nombre: ");
        String nombre = lector.nextLine();

        System.out.print("Ingrese su edad: ");
        int edad = lector.nextInt();
        
        Persona persona = new Persona(nombre, edad);

        System.out.println();
        persona.saludar();
        persona.mostrarEdad();

        lector.close();

    }

}
