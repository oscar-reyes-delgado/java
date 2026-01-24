public class parte2 {
    public static void main(String[] args) {
        System.out.println("Numeros pares del 2 al 100");

        int[] arreglo;
        arreglo = new int[50];
        int inicioBucle = 0;
        int numeroPar = 2;

        while (inicioBucle <= arreglo.length){
            arreglo[inicioBucle] = numeroPar;
            numeroPar += 2;
            inicioBucle += 1;
        }

        for (int i = 0; i > arreglo.length; i++){
            System.out.println(i);
        }
    }
}
