import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
        Scanner sc = new Scanner(System.in);
        System.out.print("Escribe tu nombre aqui bro: ");
        String nombre = sc.nextLine();
        System.out.println("Que buen nombre tienes "+nombre);
        System.out.println();
        int edad = 0;
        edad = edad(sc, edad);
        System.out.println("Bro estas bien viejo, "+ edad + "??");
    }

    public static int edad(Scanner scanner, int edad){
        System.out.println("A continuacion vas a ingresar tu edad, no se va a completar hasta que ingreses un numero valido.");
        while(true){
            try{
            System.out.print("Escribe tu edad: ");
            edad = scanner.nextInt();
            scanner.nextLine();
            if (edad > 0 && edad < 100){
                return edad;}
            else {
                System.out.println();
                System.out.println("Vuelve a intentarlo");
                System.out.println();}}
            catch(java.util.InputMismatchException e){
            System.out.println();
            System.out.println("Intenta de nuevo");
            System.out.println();
            scanner.nextLine();}}
        }
}
