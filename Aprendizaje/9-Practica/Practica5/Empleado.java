public class Empleado {

    // Atributos comunes de todos los empleados
    String nombre;
    double salario;

    // Constructor de la clase empleado
    Empleado(String nombre, double salario){
        this.nombre = nombre;
        this.salario = salario;
    }

    // Metodo que puede ser sobreescrito por las clases hijas
    double calcularSalario(){
        return salario; // retorna salario base
    }
}

// Clase hija que hereda de empleado. "Extends" significa: EmpleadoTiempoCompleto es un Empleado
class EmpleadoTiempoCompleto extends Empleado{
    // Atributo adicional solo para este tipo de empleado
    double bono;
    // Constructor de la clase hija
    EmpleadoTiempoCompleto(String nombre, double salario, double bono){
        super(nombre, salario); // Llama al constructor de la clase padre
        this.bono = bono; //Asigna el bono adicional
    }

    // Sobrescribe el metodo calcularSalario para incluir el bono
    @Override
    double calcularSalario(){
        return salario + bono; // Retorna salario base + bono
    }
}