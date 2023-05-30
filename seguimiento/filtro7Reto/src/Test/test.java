package Test;


import Clases.PersonFilterUtil;
import Clases.Persona;
import Clases.Sexo;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class test {
    @Test
    public void test1(){


        List<Persona>list=new ArrayList<>();
        list.add(new Persona("Miguel", 18, Sexo.MASCULINO));
        list.add(new Persona("Juan", 20,Sexo.MASCULINO));
        list.add(new Persona("Ana", 18,Sexo.FEMENINO));
        list.add(new Persona("Camilo", 19,Sexo.MASCULINO));
        list.add(new Persona("Miguel", 23,Sexo.MASCULINO));
        list.add(new Persona("Camilo", 17,Sexo.MASCULINO));

        list.forEach(Persona-> System.out.println(Persona.getNombre()+" "+Persona.getEdad()+" "+Persona.getSexo()));


        System.out.println("filtrando.... a personas mayores de 20, genero masculino");

        List<Persona>list1= PersonFilterUtil.filter((ArrayList<Persona>) list);

        list1.forEach(Persona-> System.out.println(Persona.getNombre()+" "+Persona.getEdad()+" "+Persona.getSexo()));


    }
}
