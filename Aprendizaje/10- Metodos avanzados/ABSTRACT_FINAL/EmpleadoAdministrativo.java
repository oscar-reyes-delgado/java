package ABSTRACT_FINAL;

public class EmpleadoAdministrativo extends Empleado{
    public EmpleadoAdministrativo(String nombre, double salarioBase){
        super(nombre, salarioBase);
    }

    // Implementacion obligatoria del metodo abstracto
    @Override
    public double calcularBono(){
        return salarioBase* 0.1;
    }
}
