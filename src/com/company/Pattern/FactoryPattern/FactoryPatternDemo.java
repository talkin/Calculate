package com.company.Pattern.FactoryPattern;

public class FactoryPatternDemo {

    public static void main(String[] args) {
        Shape circle = ShapeFactory.getShape(ShapeType.CIRCLE);
        circle.draw();

        Shape rectangle = ShapeFactory.getShape(ShapeType.RECTANGLE);
        rectangle.draw();

        Shape square = ShapeFactory.getShape(ShapeType.SQUARE);
        square.draw();
    }
}
