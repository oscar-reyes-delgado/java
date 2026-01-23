import java.util.Scanner;
public class parte1 {
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        System.out.println("=======================================\nSistema de acceso a oficina de Director\n=======================================");
        System.out.print("Escribe tu nombre: ");
        String nombre = lector.nextLine();
        String director = "Homero Gutierrez";
        lector.close();

        if (nombre.equals(director)){
            System.out.println("Director, puede ingresar a la oficina.\n");
        }else{
            System.out.println("Acceso denegado\n");
        }

    }
}
