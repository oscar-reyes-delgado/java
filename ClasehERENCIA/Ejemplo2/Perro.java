package ClasehERENCIA.Ejemplo2;

public class Perro extends Animal {
    //Sobreescribimos el metodo hacerSonido() de la clase Animal
    @Override
    public void hacerSonido() {
        System.out.println("El perro ladra");
    }
    
}
