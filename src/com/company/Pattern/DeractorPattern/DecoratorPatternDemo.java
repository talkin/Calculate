package com.company.Pattern.DeractorPattern;

public class DecoratorPatternDemo {

    public static void main(String[] args) {
        System.out.println("---------------Draw shape");
        Rectangle rectangle = new Rectangle();
        rectangle.draw();
        Circle circle = new Circle();
        circle.draw();

        System.out.println("\n---------------With color");
        Shape redRectangle = new RedShape(new Rectangle());
        redRectangle.draw();
        Shape redCircle = new RedShape(new Circle());
        redCircle.draw();

        System.out.println("\n---------------With border");
        Shape borderRectangle = new BorderShape(new Rectangle());
        borderRectangle.draw();
        Shape borderCircle = new BorderShape(new Circle());
        borderCircle.draw();

        System.out.println("\n---------------With border and RED");
        Shape borderRedRectangle = new RedShape(new BorderShape(new Rectangle()));
        borderRedRectangle.draw();
        Shape borderRedCircle = new RedShape(new BorderShape(new Circle()));
        borderRedCircle.draw();

        System.out.println("\n---------------With RED and border");
        Shape redBorderRectangle = new BorderShape(new RedShape(new Rectangle()));
        redBorderRectangle.draw();
        Shape redBorderCircle = new BorderShape(new RedShape(new Circle()));
        redBorderCircle.draw();

    }
}
