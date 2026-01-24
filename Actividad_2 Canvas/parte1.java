import java.util.Scanner;
public class parte1 {
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        System.out.println("=======================================\nSistema de acceso a oficina de Director\n=======================================");
        System.out.println("Puedes escribir 'salir' para finalizar el programa.");
        while(true){
            System.out.print("\nEscribe tu nombre: ");
            String nombre = lector.nextLine();
            String director = "Homero Gutierrez";

            if (nombre.equals(director)){
                System.out.println("Director, puede ingresar a la oficina.\n");
                break;}
            else if(nombre.equals("salir")){
                System.out.println("Saliendo del programa...\n");
                break;}
            else{
                System.out.println("Acceso denegado");}
        }
        lector.close();

    }
}
