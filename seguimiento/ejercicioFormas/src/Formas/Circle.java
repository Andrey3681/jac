package Formas;

public class Circle implements Shape {
    private final float radio;

    public Circle(float radio) {
        this.radio = radio;
    }

    @Override
    public float computerArea() {
        return (float) (Math.PI * Math.pow(radio,2));
}
}
