import java.util.Scanner;

public class CalificacionFinal{
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);

        System.out.println("======================");
        System.out.print("Ingresa la calificacion del examen parcial: ");
        double parcial = lector.nextDouble();
        System.out.print("Ingresa la calificacion del proyecto: ");
        double proyecto = lector.nextDouble();
        lector.close();
        
        double califiFinal = ((parcial * .4) + (proyecto * .6));
        int caliFinal = (int)((parcial * .4) + (proyecto * .6));
        boolean aprobado = caliFinal >= 70;

        System.out.println("======================\nPromedio real: " + califiFinal);
        System.out.println("Calificacion redondeada: "+ caliFinal);
        System.out.println("Aprobaste: "+ aprobado);
        
    }
}