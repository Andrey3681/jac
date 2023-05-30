package clases;

public class Persona {
    private int age;
    private String name;

    public Persona(int age,String name) {
        this.age = age;
        this.name=name;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
}
