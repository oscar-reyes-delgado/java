// Clase principal para ejecutar
public class Empresa{
    public static void main(String[] args) {
        // Objeto de la clase padre
        Empleado e1 = new Empleado("Ana", 3000);
        // Polimorfismo: el tipo es Empleado pero el objeto real es EmpleadoTiempoCompleto
        Empleado e2 = new EmpleadoTiempoCompleto("Luis", 3000, 500);
        //llamada al metodo calcularSalario, se comporta diferente segun el tipo eal del objeto
        System.out.println(e1.calcularSalario());
        System.out.println(e2.calcularSalario());
    }
}