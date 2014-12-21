package com.company.Pattern.DeractorPattern;

/**
 * Created by jtao on 12/21/14.
 */
public class RedShape implements Shape {
    private Shape shape;

    public RedShape(Shape shape) {
        this.shape = shape;
    }

    @Override
    public String draw() {
        return shape.draw() + " with RED color";
    }
}
