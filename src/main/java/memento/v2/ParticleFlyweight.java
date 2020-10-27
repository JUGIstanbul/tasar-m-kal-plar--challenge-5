package memento.v2;


import static java.lang.String.format;

public class ParticleFlyweight {

    private Color color;
    private Size size;
    private Shape shape;

    public ParticleFlyweight(Color color, Size size, Shape shape) {
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

}
