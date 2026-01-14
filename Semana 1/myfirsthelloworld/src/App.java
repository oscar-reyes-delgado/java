import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
        Scanner sc = new Scanner(System.in);
        System.out.print("Escribe tu nombre aqui bro: ");
        String nombre = sc.nextLine();
        System.out.println("Que buen nombre tienes "+nombre);
    }
}
