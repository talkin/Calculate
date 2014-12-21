package com.company.Pattern.FactoryPattern;

import static com.company.Pattern.FactoryPattern.ShapeType.RECTANGLE;
import static com.company.Pattern.FactoryPattern.ShapeType.SQUARE;

public class FactoryPatternDemo {

    public static void main(String[] args) {
        Shape circle = ShapeFactory.makeShape(SQUARE);
        circle.draw();

        Shape rectangle = ShapeFactory.makeShape(RECTANGLE);
        rectangle.draw();

        Shape square = ShapeFactory.makeShape(SQUARE);
        square.draw();
    }
}
