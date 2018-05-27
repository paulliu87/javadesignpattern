package beans;

import java.awt.Color;
import java.awt.Graphics;

public class Oval implements Shape {
    private boolean fill;

    public Oval (boolean foo) {
        this.fill = foo;

        System.out.println("Creating Oval with fill " + foo);
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void draw(Graphics oval, int x1, int y1, int x2, int y2, Color color) {
        oval.setColor(color);
        oval.drawOval(x1, y1, x2, y2);
        if (fill) {
            oval.fillOval(x1, y1, x2, y2);
        }
    }
}
