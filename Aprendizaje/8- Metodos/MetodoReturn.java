public class MetodoReturn {
    public static int calcularArea(int base, int altura) {
        return base * altura;
    }
    public static void main(String[] args) {
        int resultado = calcularArea(5, 10);
        System.out.println("El area es: " + resultado);
    }
}