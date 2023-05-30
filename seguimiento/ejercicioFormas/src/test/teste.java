package test;

import Formas.Circle;
import Formas.Shape;
import Formas.Square;
import Formas.Triangle;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.OptionalDouble;
import java.util.stream.Collectors;

public class teste {
    //esto lo saque de
    @Test
    public void test01(){
        List<Shape> list = new ArrayList<>();

        for (int i = 0; i < 100; i++) {
            switch (i%3){
                case 0: list.add(new Circle((float) (Math.random()*i))); break;
                case 1: list.add(new Square((float) (Math.random()*i))); break;
                case 2: list.add(new Triangle((float) (Math.random()*i), (float) (Math.random()*i))); break;
            }
        }

        list.forEach(Shape->System.out.println("todas las Areas generadas"+Shape.computerArea()));

        System.out.println(" filtrando....");

        List<Shape>cuadrados= list.stream().filter(Shape-> Shape instanceof Square).collect(Collectors.toList());

        System.out.println(" la lista de los cuadrados es");

        cuadrados.forEach(Square->System.out.println(Square.computerArea()));

        // hallamos el min de los cuadrados
        OptionalDouble minCuadrado= list.stream().filter(Shape->Shape instanceof Square).mapToDouble(Square->Square.computerArea()).min();

        System.out.println(" el area minima de los cuadrados es: "+ minCuadrado);

        // hallamos el max de las areas de los cuadrados
        OptionalDouble maxCuadrado= list.stream().filter(Shape->Shape instanceof Square).mapToDouble(Square->Square.computerArea()).max();

        System.out.println("el area max de los cuadrados es: "+ maxCuadrado);

        // hallamos el promedio del area de los cuadrados
        OptionalDouble averageCuadrado= list.stream().filter(Shape->Shape instanceof Square).mapToDouble(Square->Square.computerArea()).average();

        System.out.println("el promedio de las areas de los cuadrados es: "+ averageCuadrado);

        //hallamos la suma de las areas

        double sumaCadrado=list.stream().filter(Shape->Shape instanceof Square).mapToDouble(Square->Square.computerArea()).sum();

        System.out.println(" la suma de las areas es igual a "+ sumaCadrado);


    }


}
