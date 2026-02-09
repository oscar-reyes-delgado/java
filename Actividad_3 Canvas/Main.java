import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // Creamos los dos objetos
        Producto p1 = new Producto();
        Producto p2 = new Producto();

        System.out.println("--- Captura de Producto 1 ---");
        llenarProducto(p1, sc);

        System.out.println("\n--- Captura de Producto 2 ---");
        llenarProducto(p2, sc);

        // Mostramos resultados 
        System.out.println("\n--- Resumen de Productos ---");
        p1.muestraProducto();
        p2.muestraProducto();

        // Comparación usando el método estático
        System.out.println("\nResultado: " + compararProductos(p1, p2));
    }

    // --- FUNCIÓN DE VALIDACIÓN QUE RETORNA VALOR ---
    public static double leerDoubleValido(String mensaje, Scanner sc) {
        double valor = 0;
        boolean esValido = false;
        
        while (!esValido) {
            try {
                System.out.print(mensaje);
                valor = Double.parseDouble(sc.nextLine());
                esValido = true; 
            } catch (NumberFormatException e) {
                System.out.println("¡Error! Por favor, ingresa un número válido (entero o decimal).");
            }
        }
        return valor;
    }

    // Método para llenar los datos de cada producto
    public static void llenarProducto(Producto p, Scanner sc) {
        System.out.print("Descripción: "); p.setDescripcion(sc.nextLine());
        System.out.print("Código: "); p.setCodigo(sc.nextLine());
        System.out.print("Tipo: "); p.setTipo(sc.nextLine());
        
        // Usamos la función de validación para los datos numéricos
        p.setCosto(leerDoubleValido("Costo: ", sc));
        p.setImpuesto(leerDoubleValido("Impuesto (%): ", sc));
    }

    // Método estático de comparación 
    public static String compararProductos(Producto a, Producto b) {
        double utilidad = 20.0;
        double precioA = a.calcularPrecio(utilidad);
        double precioB = b.calcularPrecio(utilidad);

        if (precioA > precioB) {
            return "El producto más caro es: " + a.getDescripcion();
        } else if (precioB > precioA) {
            return "El producto más caro es: " + b.getDescripcion();
        } else {
            return "Ambos productos tienen el mismo precio.";
        }
    }
}