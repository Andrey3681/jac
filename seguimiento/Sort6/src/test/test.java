package test;

import clases.Persona;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class test {
    @Test
    public void test01(){
        List<Persona> listaPersona= new ArrayList<>();
        Persona persona0 = new Persona(12, "ana");
        Persona persona2=new Persona(12, "camilo");
        Persona persona1= new Persona(19, "camilo");
        Persona persona3= new Persona(20, "juan");
        Persona persona4=new Persona(18, "miguel");
        Persona persona5=new Persona(23, "miguel");
        listaPersona.add(persona0);
        listaPersona.add(persona1);
        listaPersona.add(persona2);
        listaPersona.add(persona3);
        listaPersona.add(persona4);
        listaPersona.add(persona5);
        //DUda cual es la diferencia entre sort y sorted
        listaPersona.sort(Comparator.comparing(Persona::getName).thenComparingInt(Persona::getAge));

        listaPersona.forEach(Persona->System.out.println(Persona.getName()+" "+Persona.getAge()));

        //hago que la lista quede alrevez
        listaPersona.sort(Comparator.comparing(Persona::getName).thenComparingInt(Persona::getAge).reversed());

        System.out.println("lista al reves");

        listaPersona.forEach(Persona->System.out.println(Persona.getName()+" "+Persona.getAge()));



    }
}
