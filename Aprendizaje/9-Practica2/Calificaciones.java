// Sistema de Calificaciones
import java.util.Scanner;
public class Calificaciones {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese el número de calificaciones a procesar: ");
        int n = sc.nextInt();

        double suma = 0;
        double mayor = 0;
        double menor = 100;

        for (int i = 1; i <= n; i++) {
            double calificacion = leerCalificacion(sc, i);
            suma += calificacion;

            if (calificacion > mayor) {
                mayor = calificacion;
            }
            if (calificacion < menor) {
                menor = calificacion;
            }
        }

        double promedio = suma / n;
        mostrarResultado(promedio, mayor, menor);
    }
}
    
}
