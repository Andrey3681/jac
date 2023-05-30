package test;


import clases.Persona;
import org.junit.jupiter.api.Test;

import java.util.*;

public class test {
    @Test
    public void test01(){
        List<Persona>list= new ArrayList<>();
        list.add(new Persona("Miguel", 18));
        list.add(new Persona("Juan", 20));
        list.add(new Persona("Ana", 18));
        list.add(new Persona("Camilo", 19));
        list.add(new Persona("Miguel", 23));
        list.add(new Persona("Camilo", 17));

        OptionalInt max= list.stream().mapToInt(Persona->Persona.getName().length()).max();
        System.out.println(max);
        OptionalInt min= list.stream().mapToInt(Persona->Persona.getName().length()).min();
        System.out.println(min);
        OptionalDouble pro= list.stream().mapToLong(Persona->Persona.getName().length()).average();
        System.out.println(pro);

    }

}
