package Test;
import clases.Persona;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class test {

    @Test
    public void test(){
        List<Persona>listaPersona= new ArrayList<>();
        Persona persona0 = new Persona("ana", 12);
        Persona persona2=new Persona("camilo",12);
        Persona persona1= new Persona("camilo",19);
        Persona persona3= new Persona("juan",20);
        Persona persona4=new Persona("miguel",18);
        Persona persona5=new Persona("miguel",23);
        listaPersona.add(persona0);
        listaPersona.add(persona1);
        listaPersona.add(persona2);
        listaPersona.add(persona3);
        listaPersona.add(persona4);
        listaPersona.add(persona5);


        for (Persona persona: listaPersona){
            System.out.println(persona.getNombre()+" "+persona.getEdad());
        }

        System.out.println("las personas menores de 20 años son");


        List<Persona>personasFilatradas= listaPersona.stream().filter(Persona->Persona.getEdad()<20).collect(Collectors.toList());


        personasFilatradas.forEach(Persona-> System.out.println(Persona.getNombre()+" "+Persona.getEdad()));
        }


    }

