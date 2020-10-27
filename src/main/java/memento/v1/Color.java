package memento.v1;

import java.util.Random;

public enum Color {
    RED, BLUE, GREEN;

    public static Random random = new Random();

    public static Color random() {
        return Color.values()[random.nextInt(Color.values().length)];
    }
}
