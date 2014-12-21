package com.company.Pattern.DeractorPattern;

/**
 * Created by jtao on 12/21/14.
 */
public class BorderShape implements Shape {
    private Shape shape;

    public BorderShape(Shape shape) {
        this.shape = shape;
    }

    @Override
    public String draw() {
        return shape.draw() + " with border";
    }
}
