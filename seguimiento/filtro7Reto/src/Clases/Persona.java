package Clases;

public class Persona {
    private String nombre;
    private int edad;

    private Sexo sexo;

    public Persona(String nombre, int edad, Sexo sexo) {
        this.nombre = nombre;
        this.edad=edad;
        this.sexo= sexo;
    }

    public Sexo getSexo() {
        return sexo;
    }

    public int getEdad() {
        return edad;
    }

    public String getNombre() {

        return nombre;
    }
}
