package beans;

import beans.Shape;

public class Circle implements Shape {
    @Override
    public void draw(String fillcolor) {
        System.out.println("Drawing Circle with color " + fillcolor);
    }
}
