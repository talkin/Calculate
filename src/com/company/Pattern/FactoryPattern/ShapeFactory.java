package com.company.Pattern.FactoryPattern;

public class ShapeFactory {
    public static Shape makeShape(ShapeType shapeType) {

        if (shapeType.equals(ShapeType.CIRCLE)) {
            return new Circle();
        } else if (shapeType.equals(ShapeType.RECTANGLE)) {
            return new Rectangle();
        } else if (shapeType.equals(ShapeType.SQUARE)) {
            return new Square();
        }

        return null;
    }
}
