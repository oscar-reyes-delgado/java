package ABSTRACT_FINAL;

public class Main {
    public static void main(String[] args) {
        // Polimorfismo: referencia de tipo de empleado
        Empleado admin = new EmpleadoAdministrativo
        ("Ana", 10000);
        Empleado ventas = new EmpleadoVentas("Carlos", 
        15000);

        System.out.println("Empleado Administrativo");
        System.out.println("Salario base: " + admin.
        calcularSalarioBase());
        System.out.println("Bono: " + admin.calcularBono
        ());

        System.out.println("\nEmpleado de Ventas");
        System.out.println("Salario base: " + ventas.
        calcularSalarioBase());
        System.out.println("Bono: " + ventas.
        calcularBono());
    }
}
