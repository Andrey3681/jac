package clases;

import java.util.function.Predicate;

public class PersonFilterUtil {

    public static Predicate<Persona>filtroEdad(int edad){
        return (Persona)-> Persona.getEdad()<edad;
    }
}
