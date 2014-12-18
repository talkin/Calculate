package com.company.Pattern.FactoryPattern;

/**
 * Created by jtao on 12/18/14.
 */
public class ShapeFactory {
    public Shape getShape(String shapeType) {

        if (shapeType.equalsIgnoreCase("CIRCLE")) {
            return new Circle();
        } else if (shapeType.equalsIgnoreCase("RECTANGLE")) {
            return new Rectangle();
        } else if (shapeType.equalsIgnoreCase("SQUARE")) {
            return new Square();
        }

        return null;
    }
}
