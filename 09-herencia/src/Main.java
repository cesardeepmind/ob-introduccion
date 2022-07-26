public class Main {
    public static void main(String[] args) {
        Cliente cliente = new Cliente();
        Trabajador trabajador = new Trabajador();
        cliente.nombre = "Cesar";
        cliente.edad = 28;
        cliente.telefono = 981159596;
        cliente.credito = 150.000;
        System.out.println("Soy " + cliente.nombre + ", tengo " + cliente.edad + " años y mi telefono es " + cliente.telefono
                + " y mi credito disponible es " + cliente.credito + "Gs.");

        trabajador.nombre = "Ivan";
        trabajador.edad = 29;
        trabajador.telefono = 981330130;
        trabajador.salario = 200000;
        System.out.println("Soy " + trabajador.nombre + ", tengo " + trabajador.edad + " años y mi telefono es " + trabajador.telefono
                + " y mi salario es de " + trabajador.salario + "Gs.");

    }
}

class Persona{
    int edad;
    int telefono;
    String nombre;
}

class Cliente extends Persona{
    double credito;
}

class Trabajador extends Persona {
    double salario;
}