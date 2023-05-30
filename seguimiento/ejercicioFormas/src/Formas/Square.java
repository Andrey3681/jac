package Formas;

public class Square implements Shape {
    private float lado;

    public Square(float lados) {
        this.lado = lados;
    }

    @Override
    public float computerArea() {
        return (float)(lado *2);
    }
}
