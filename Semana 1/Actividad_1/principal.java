package Actividad_1;
import java.util.Scanner;

public class principal{
    public static void main(String[] args) {
        System.out.println("==========================");
        System.out.println("   Registro de alumno");
        System.out.println("==========================");

        Scanner lector = new Scanner(System.in);

        System.out.print("Ingresa el nombre: ");
        String nombre = lector.nextLine();
        System.out.println();

        System.out.print("Ingresa el numero del semestre: ");
        int semestre = lector.nextInt();
        System.out.println();
        lector.nextLine();

        System.out.print("Ingresa la matricula: ");
        String matricula = lector.nextLine();
        System.out.println();

        System.out.print("Ingresa la carrera: ");
        String carrera = lector.nextLine();
        System.out.println();

        alumno alumno1  = new alumno(nombre, semestre, matricula, carrera);

        alumno1.estudiar();
        alumno1.mostrar_credencial();
        alumno1.asistencia();

        lector.close();
    }
}

