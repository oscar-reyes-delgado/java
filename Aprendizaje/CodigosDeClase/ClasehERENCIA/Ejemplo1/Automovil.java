package Aprendizaje.CodigosDeClase.ClasehERENCIA.Ejemplo1;

public class Automovil extends Vehiculo {
    int Puertas;

    //Constructor usando super para heredar atributos de la clase base
    public Automovil(String marca, int anio, int Puertas) {
        super(marca, anio); // Llamada al constructor de la clase base
        this.Puertas = Puertas;
    }

    //Metodo especifico de Automovil
    public void mostrarPuertas(){
        System.out.println("Numero de puertas: " + Puertas);
    }
    
}
