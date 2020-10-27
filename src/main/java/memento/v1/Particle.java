package memento.v1;


import static java.lang.String.format;

public class Particle {

    private Color color;
    private Size size;
    private Shape shape;

    private int x;
    private int y;

    public Particle(Color color, Size size, Shape shape) {
        this.color = color;
        this.size = size;
        this.shape = shape;
    }

    public Color getColor() {
        return color;
    }

    public Size getSize() {
        return size;
    }

    public Shape getShape() {
        return shape;
    }

    public void changePosition(int x, int y) {

        this.x = x;
        this.y = y;
    }

    public void draw() {
        System.out.println(format("Particle{%s, %s, %s}", shape, color, size));
    }
}
