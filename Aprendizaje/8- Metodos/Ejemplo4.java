public class Ejemplo4 {
    public static double calcularPromedio(double a, double b, double c){
        return (a+b+c)/3;
    }

    public static String determinarResultado(double promedio){
        if (promedio>=70){
            return "Aprobado";
        }
        else{
            return "Desaprobado pa";
        }
    }

    public static void main(String[] args) {
        double promedio = calcularPromedio(46, 56, 100);
        String resultado = determinarResultado(promedio);

        System.out.println("El promedio es: "+ promedio);
        System.out.println("Usted fue "+ resultado);
    }
}
