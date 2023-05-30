package Test;


import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import java.util.stream.Collectors;

public class test1 {


    @Test
    public void test1() {




        //tener una lista y filtrarla por los que sean menores de 20 años

        List<Persona> list = new ArrayList<>();

        list.add(new Persona("Miguel", 18));
        list.add(new Persona("Juan", 20));
        list.add(new Persona("Ana", 18));
        list.add(new Persona("Camilo", 19));
        list.add(new Persona("Miguel", 23));
        list.add(new Persona("Camilo", 17));

        for (Persona persona : list) {
            System.out.println(persona.getNombre() + " " + persona.getEdad());
        }
        System.out.println("filtering...");
        List<Persona> listResult = list.stream()
                .filter(Persona-> Persona.getEdad()<20)
                .collect(Collectors.toList());
        listResult.forEach(persona -> System.out.println(persona.getNombre()+" "+persona.getEdad()));

    }

}


