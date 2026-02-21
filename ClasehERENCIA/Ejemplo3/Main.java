package ClasehERENCIA.Ejemplo3;

public class Main {
    public static void main(String[] args) {
        Gerente g = new Gerente("Juan", 50000, 10000);
        g.mostrarDatos(); // Método heredado de Empleado
        g.mostrarSalario(); // Método específico de Gerente
    }
}
