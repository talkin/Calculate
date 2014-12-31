package com.company.Pattern.FactoryPattern;

import org.junit.Test;

import static com.company.Pattern.FactoryPattern.ShapeType.CIRCLE;
import static com.company.Pattern.FactoryPattern.ShapeType.RECTANGLE;
import static com.company.Pattern.FactoryPattern.ShapeType.SQUARE;

public class ShapeFactoryTest {

    @Test
    public void should_factory_create_a_circle() throws Exception {
        Shape shape = ShapeFactory.makeShape(CIRCLE);

        assert(shape instanceof Circle);
    }

    @Test
    public void should_factory_create_a_rectangle() throws Exception {
        Shape shape = ShapeFactory.makeShape(RECTANGLE);

        assert(shape instanceof Rectangle);
    }

    @Test
    public void should_factory_create_a_square() throws Exception {
        Shape shape = ShapeFactory.makeShape(SQUARE);

        assert(shape instanceof Square);
    }
}