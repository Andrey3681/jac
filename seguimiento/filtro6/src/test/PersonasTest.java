package test;


import clases.Persona;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import static clases.PersonFilterUtil.filtroEdad;

public class PersonasTest {
    @Test
            public void test(){
    List<Persona> listaPersona= new ArrayList<>();
    Persona persona = new Persona("ana",12);
    Persona persona2=new Persona("camilo",12);
    Persona persona1= new Persona("camilo",19);
    Persona persona3= new Persona("juan",20);
    Persona persona4=new Persona("miguel",18);
    Persona persona5=new Persona("miguel",23);
    listaPersona.add(persona);
    listaPersona.add(persona1);
    listaPersona.add(persona2);
    listaPersona.add(persona3);
    listaPersona.add(persona4);
    listaPersona.add(persona5);

    listaPersona.forEach(Persona->System.out.println(Persona.getNombre()+" "+Persona.getEdad()));

    System.out.println("se fitraran personas menores a 20 años");


    List<Persona>listaOrganizada= listaPersona.stream().filter(filtroEdad(20)).collect(Collectors.toList());

        listaOrganizada.forEach(Persona->System.out.println(Persona.getNombre()+" "+Persona.getEdad()));

}

}
