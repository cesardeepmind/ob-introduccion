public class Main {
    public static void main(String[] args) {

        Persona persona = new Persona();
        persona.setNomb("Raul");
        System.out.println("Mi nombre es " + persona.getNomb());
        persona.setEdad(23);
        System.out.println("Tengo " + persona.getEdad() + " años");
        persona.setTelef(829240212);
        System.out.println("Mi teléfono es " + persona.getTelef());
    }
}

class Persona {
    private String nombre;
    private int edad;
    private int telefono;

    public void setNomb(String nombre) {
        this.nombre = nombre;
    }

    public String getNomb() {
        return nombre;
    }

    public void setEdad(int edad){
        this.edad = edad;
    }

    public int getEdad() {
        return edad;
    }

    public void setTelef(int telefono){
        this.telefono = telefono;
    }

    public int getTelef() {
        return telefono;
    }
}