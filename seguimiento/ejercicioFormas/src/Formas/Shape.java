package Formas;

public interface Shape extends Comparable<Shape>{
    float computerArea();

    @Override
    default int compareTo(Shape other){
       return (int)(computerArea() - other.computerArea());
    }
}
