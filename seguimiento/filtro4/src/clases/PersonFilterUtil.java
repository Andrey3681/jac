package clases;

import java.util.function.Predicate;

public class PersonFilterUtil{


    public static Predicate<Persona> filtroEdad(int edad){
        Predicate<Persona> predicado= new Predicate<>(){
            @Override
            public boolean test(Persona persona){
                return persona.getEdad()<edad;
            }
        };
        return predicado;
    }


}
