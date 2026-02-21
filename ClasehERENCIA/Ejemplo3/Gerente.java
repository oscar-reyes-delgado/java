package ClasehERENCIA.Ejemplo3;

public class Gerente  extends Empleado {
    double bono;

    public Gerente(String nombre, double salario, double bono) {
        super(nombre, salario);
        this.bono = bono;
    }

    public void mostrarSalario(){
        double total = salario + bono;
        // Esto es permitido porque el atributo salario es protected en la clase Empleado
        System.out.println("Salario total del gerente: " + total);
    }
}
