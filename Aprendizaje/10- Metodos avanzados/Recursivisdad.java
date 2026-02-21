public class Recursivisdad {
    
    //Metodo recursivo para sumar del 1 al n
    public static int sumar(int n){
        if(n == 1){
            return 1; // Caso base
        } else {
            return n + sumar(n - 1); // Llamada recursiva
        }
    }
    public static void main(String[] args) {
        int resultado = sumar(5);
        System.out.println("La suma del 1 al 5 es: " + resultado);
    }
}
