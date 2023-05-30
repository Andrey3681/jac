package clases;

import java.util.List;

public class Persona {
    private String name;
    private int age;

    public Persona(String name,int age) {
        this.name = name;
        this.age=age;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }


    //metodo para hallar max

    public static int calcularmax(List<Persona>personaList){
        int max=0;
        for(int i=0;i<personaList.size();i++){
            if(personaList.get(i).getName().length()>=max){
                max=personaList.get(i).getName().length();
            }

        }
        return max;
    }

    //metotod para hallar minimo

    public static int calularMinimo(List<Persona>personaList){
        int min= calcularmax(personaList);
        for (int i=0;i<personaList.size();i++){
            if(personaList.get(i).getName().length()<min){
                min=personaList.get(i).getName().length();
            }
        }
        return min;
    }


    //metodo

}
