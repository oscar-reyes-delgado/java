import java.util.Scanner;

public class RegistroLaptop {
    public static void main(String[] args) throws Exception {
        System.out.println("----- Registro de Laptop -----");

        System.out.print("Ingresa el nombre de tu Laptop: ");
        Scanner lector = new Scanner(System.in);
        String nombre = lector.nextLine();
        System.out.println();

        System.out.print("Ingresa la marca de tu dispositivo: ");
        String marca = lector.nextLine();
        System.out.println();

        int ram = 0;
        do{
            try{
                System.out.print("Ingresa el numero de la ram en GB: ");
                ram = lector.nextInt();
                if(ram > 0){
                    break;
                }
                else{
                    System.out.println();
                    System.out.println("Intenta de nuevo");
                    lector.nextLine();
                }
            }
            catch(java.util.InputMismatchException e){
                System.out.println();
                System.out.println("Intenta de nuevo");
                lector.nextLine();
            }
        }
        while(ram <= 0);
        System.out.println();

        int almacenamiento = 0;
        do{
            try{
                System.out.print("Ingresa el numero de almacenamiento en GB: ");
                almacenamiento = lector.nextInt();
                if(almacenamiento > 0){
                    break;
                }
                else{
                    System.out.println();
                    System.out.println("Intenta de nuevo");
                    lector.nextLine();
                }
            }
            catch(java.util.InputMismatchException e){
                System.out.println();
                System.out.println("Intenta de nuevo");
                lector.nextLine();
            }
        }
        while(almacenamiento <= 0);
        System.out.println();

        System.out.println("----- Datos de la Laptop -----");
        System.out.println("Nombre: " + nombre);    
        System.out.println("Marca: " + marca);
        System.out.println("RAM: " + ram + " GB");
        System.out.println("Almacenamiento: " + almacenamiento + " GB");
        System.out.println("------------------------------");
        lector.close();

    }
}
