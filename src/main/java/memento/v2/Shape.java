package memento.v2;

import java.util.Random;

public enum Shape {
    TRIANGLE, SQUARE, CIRCLE;

    public static Random random = new Random();

    public static Shape random() {
        return Shape.values()[random.nextInt(Shape.values().length)];
    }
}
