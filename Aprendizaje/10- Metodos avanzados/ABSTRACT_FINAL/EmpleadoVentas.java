package ABSTRACT_FINAL;

public class EmpleadoVentas extends Empleado{
    public EmpleadoVentas(String nombre, double salarioBase){
        super(nombre, salarioBase);
    }

    // Implementacion obligatoria del metodo abstracto
    @Override
    public double calcularBono(){
        return salarioBase * 0.2;
    }
}
