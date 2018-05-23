package beans;

import beans.Shape;

public class Triangle implements Shape {
    public void draw(String fillcolor) {
        System.out.println("Drawing Triangle with color " + fillcolor);
    }
}
