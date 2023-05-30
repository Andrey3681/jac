package clases;

import clases.Persona;
import java.util.function.Predicate;

public class PersonFilterUtil implements    Predicate<Persona> {
    @Override
    public boolean test(Persona persona) {
        return persona.getEdad()<20;
    }
}
