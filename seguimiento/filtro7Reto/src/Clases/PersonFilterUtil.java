package Clases;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class PersonFilterUtil {
    public static List<Persona> filter(ArrayList<Persona> listPersona) {
        return listPersona.stream()
                .filter(Persona -> Persona.getSexo() == Sexo.MASCULINO)
                .filter(Persona -> Persona.getEdad() >= 20)
                .collect(Collectors.toList());
    }
}
