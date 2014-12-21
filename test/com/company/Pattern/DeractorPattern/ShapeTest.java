package com.company.Pattern.DeractorPattern;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class ShapeTest {

    @Test
    public void should_draw_rectangle() throws Exception {
        Rectangle rectangle = new Rectangle();
        assertThat(rectangle.draw(), is("Drawing rectangle"));
    }

    @Test
    public void should_draw_circle() throws Exception {
        Circle circle = new Circle();
        assertThat(circle.draw(), is("Drawing circle"));
    }

    @Test
    public void should_draw_red_rectangle() throws Exception {
        Shape redShape = new RedShape(new Rectangle());
        assertThat(redShape.draw(), is("Drawing rectangle with RED color"));
    }

    @Test
    public void should_draw_red_circle() throws Exception {
        Shape redShape = new RedShape(new Circle());
        assertThat(redShape.draw(), is("Drawing circle with RED color"));
    }

    @Test
    public void should_draw_border_rectangle() throws Exception {
        Shape borderShape = new BorderShape(new Rectangle());
        assertThat(borderShape.draw(), is("Drawing rectangle with border"));
    }

    @Test
    public void should_draw_border_circle() throws Exception {
        Shape borderShape = new BorderShape(new Circle());
        assertThat(borderShape.draw(), is("Drawing circle with border"));
    }

    @Test
    public void should_draw_border_and_red_rectangle() throws Exception {
        Shape borderShape = new RedShape(new BorderShape(new Rectangle()));
        assertThat(borderShape.draw(), is("Drawing rectangle with border with RED color"));
    }

    @Test
    public void should_draw_border_and_red_circle() throws Exception {
        Shape borderShape = new RedShape(new BorderShape(new Circle()));
        assertThat(borderShape.draw(), is("Drawing circle with border with RED color"));
    }

    @Test
    public void should_draw_red_and_border_rectangle() throws Exception {
        Shape borderShape = new BorderShape(new RedShape(new Rectangle()));
        assertThat(borderShape.draw(), is("Drawing rectangle with RED color with border"));
    }

    @Test
    public void should_draw_red_and_border_circle() throws Exception {
        Shape borderShape = new BorderShape(new RedShape(new Circle()));
        assertThat(borderShape.draw(), is("Drawing circle with RED color with border"));
    }
}