package memento.v2;

import java.util.Random;

public enum Size {
    LARGE, MEDIUM, SMALL;

    public static Random random = new Random();

    public static Size random() {
        return Size.values()[random.nextInt(Size.values().length)];
    }
}
