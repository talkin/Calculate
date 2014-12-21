package com.company.Pattern.FactoryPattern;

import org.junit.Test;

public class ShapeFactoryTest {

    @Test
    public void should_factory_create_a_circle() throws Exception {
        Shape shape = ShapeFactory.makeShape(ShapeType.CIRCLE);

        assert(shape instanceof Circle);
    }

    @Test
    public void should_factory_create_a_rectangle() throws Exception {
        Shape shape = ShapeFactory.makeShape(ShapeType.RECTANGLE);

        assert(shape instanceof Rectangle);
    }

    @Test
    public void should_factory_create_a_square() throws Exception {
        Shape shape = ShapeFactory.makeShape(ShapeType.SQUARE);

        assert(shape instanceof Square);
    }
}