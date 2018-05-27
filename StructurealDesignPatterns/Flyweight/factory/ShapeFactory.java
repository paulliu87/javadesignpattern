package factory;

import java.util,HashMap;

public class ShapeFactory {
    private static final HashMap<ShapeType, Shape> shapes = new HashMap<ShapeType, Shape>();

    public static Shape getShape(ShapeType type) {
        Shape shapeImpl = shapes.get(type);

        if (shapeImpl == null) {
            if (type.equals(OVAL_FILL)) {
                shapeImpl = new Oval(true);
            } else if (type.equals(OVAL_NO_FILL)) {
                shapeImpl = new Oval(false);
            } else if (type.equals(LINE)) {
                shapeImpl = new Line();
            } else {
                shapes.put(type, shapeImpl);
            }
        }
        return shapeImpl;
    }

    public static enum ShapeType {
        OVAL_FILL, OVAL_NO_FILL, LINE;
    }
}
