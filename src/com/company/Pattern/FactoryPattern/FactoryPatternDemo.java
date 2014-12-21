package com.company.Pattern.FactoryPattern;

public class FactoryPatternDemo {

    public static void main(String[] args) {
        Shape circle = ShapeFactory.makeShape(ShapeType.CIRCLE);
        circle.draw();

        Shape rectangle = ShapeFactory.makeShape(ShapeType.RECTANGLE);
        rectangle.draw();

        Shape square = ShapeFactory.makeShape(ShapeType.SQUARE);
        square.draw();
    }
}
