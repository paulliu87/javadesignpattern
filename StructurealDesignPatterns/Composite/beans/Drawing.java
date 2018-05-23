package beans;

import java.util.ArrayList;
import java.util.List;
import beans.Shape;

public class Drawing implements Shape {
    private List<Shape> shapes = new ArrayList<Shape>();

    @Override
    public void draw(String fillcolor) {
        for (Shape s : shapes) {
            s.draw(fillcolor);
        }
    }

    public void add(Shape s) {
        shapes.add(s);
    }

    public void remove(Shape s) {
        shapes.remove(s);
    }

    public void clear() {
        System.out.println("Clearing all the shapes from drawing");
        this.shapes.clear();
    }
}
