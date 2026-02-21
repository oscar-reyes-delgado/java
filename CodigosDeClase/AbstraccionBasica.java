package CodigosDeClase;

// Abstraccion basica
// Crear clase abstracta (no se puede crear un objeto directamente)

abstract class Animal{
    // Metodo abstracto (no tiene implementacion)
    // Las clases hijas estan obligadas a implementarlo
    abstract void hacerSonido();
    void dormir(){
        System.out.println("El animal esta durmiendo...");
    }
}

class perro extends Animal{
    void hacerSonido(){
        System.out.println("El perro ladra...");
    }
}

class gato extends Animal{
    void hacerSonido(){
        System.out.println("El gato maulla...");
    }
}

public class AbstraccionBasica{
    public static void main(String[] args) {
        // No se puede crear Animal a = new Animal(), porque es abstracta, no se pueden crear objetos de la misma, es como una base
        // En cambio, los objetos los creamos con la clase perro o gato, que si estan definidas
        perro perronsisimo = new perro();
        gato gatosisimo = new gato();

        perronsisimo.dormir();
        perronsisimo.hacerSonido();

        gatosisimo.dormir();
        gatosisimo.hacerSonido();
    }
}