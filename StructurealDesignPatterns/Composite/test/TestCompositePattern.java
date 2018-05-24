package test;

import beans.Circle;
import beans.Triangle;
import beans.Shape;
import beans.Drawing;

public class TestCompositePattern {
    public static void main(String[] args) {
        Shape tri1 = new Triangle();
        Shape tri2 = new Triangle();
        Shape cir1 = new Circle();

        Drawing drawing = new Drawing();
        drawing.add(tri1);
        drawing.add(tri1);
        drawing.add(cir1);

        drawing.draw("Red");

        drawing.clear();
        drawing.add(tri2);
        drawing.add(cir1);
        drawing.draw("Green");
    }
}
