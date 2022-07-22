public class Main {
    public static void main(String[] args) {
        suma(20, 40, 60);

        Coches miCoche = new Coches();

        miCoche.sumaPuertas();
        miCoche.sumaPuertas();
        System.out.println("El numero de puertas es: " + miCoche.numDePuertas);

    }

    public static void suma(int a, int b, int c){
        int resul;
        resul = a + b + c;
        System.out.println(resul);
    }
}

class Coches {
    public int numDePuertas = 4;

    public void sumaPuertas(){

        this.numDePuertas++;
    }
}