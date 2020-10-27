package memento.v2;


import static java.lang.String.format;

public class Particle {

    private ParticleFlyweight flyweight;

    private int x;
    private int y;

    public Particle(ParticleFlyweight flyweight) {
        this.flyweight = flyweight;
    }

    public Color getColor() {
        return flyweight.getColor();
    }

    public Size getSize() {
        return flyweight.getSize();
    }

    public Shape getShape() {
        return flyweight.getShape();
    }

    public void changePosition(int x, int y) {

        this.x = x;
        this.y = y;
    }

    public void draw() {
        System.out.println(format("Particle{%s, %s, %s}", getShape(), getColor(), getSize()));
    }
}
