public class Ejemplo3 {
    public static int sumar(int a, int b) {
        return a + b;
    }
    
    public static int sumar(int a, int b, int c) {
        return a + b + c;
    }

    public static void main(String[] args) {
        System.out.println("La suma de 2 y 3 es: " + sumar(2, 3));
        System.out.println("La suma de 2, 3 y 4 es: " + sumar(2, 3, 4));
    }
}
