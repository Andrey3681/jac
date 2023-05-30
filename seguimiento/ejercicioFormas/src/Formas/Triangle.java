package Formas;

import Formas.Shape;

public class Triangle implements Shape {
    private final float base;
    private final float altura;

    public Triangle(float base,float altura){
        this.base=base;
        this.altura=altura;
    }

    @Override
    public float computerArea() {
        return (float) (base*altura/2);
    }
}
