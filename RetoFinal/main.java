package RetoFinal;

public class Main{
    public static void main(String[] args) {
        Biblioteca tecmiLibrary = new Biblioteca();

        // 1. Crear materiales (Polimorfismo: Material m = nuevo Libro)
        Material libro1 = new Libro("Clean Code", 101, 5, "Robert C. Martin");
        Material libro2 = new Libro("Java POO", 102, 3, "Deitel");
        Material libro3 = new Libro("Design Patterns", 103, 2, "Gang of Four");

        // 2. Registrar datos
        tecmiLibrary.registrarMaterial(libro1);
        tecmiLibrary.registrarMaterial(libro2);
        tecmiLibrary.registrarMaterial(libro3);
        
        Usuario oscar = new Usuario("Oscar Reyes", 7163611);
        tecmiLibrary.registrarUsuario(oscar);

        // 3. PROBAR REGLAS DE NEGOCIO (Límite de 2 libros)
        System.out.println("--- Iniciando Pruebas de Préstamo ---");
        tecmiLibrary.procesarPrestamo(101, 7163611); // 1er libro: OK
        oscar.recibirMaterial(libro1);
        
        tecmiLibrary.procesarPrestamo(102, 7163611); // 2do libro: OK
        oscar.recibirMaterial(libro2);
        
        tecmiLibrary.procesarPrestamo(103, 7163611); // 3er libro: DEBE FALLAR
        
        // 4. PROBAR CASTING
        System.out.println("\n--- Probando Conversión de Objetos (Casting) ---");
        tecmiLibrary.realizarCastingDeLibro(101);
    }
}