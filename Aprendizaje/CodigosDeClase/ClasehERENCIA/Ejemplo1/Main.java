package Aprendizaje.CodigosDeClase.ClasehERENCIA.Ejemplo1;

public class Main {
    public static void main(String[] args) {
        //Creacion de un objeto de la clase Automovil
        Automovil Auto = new Automovil("Toyota", 2020, 4);
        
        //Llamada a metodos heredados de Vehiculo
        Auto.mostrarInfo(); // metodo heredado de Vehiculo
        Auto.acelerar(); // metodo heredado de Vehiculo
        
        //Llamada a metodo especifico de Automovil
        Auto.mostrarPuertas(); // metodo propio de Automovil
    }
}
