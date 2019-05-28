package hw_5.hw_5_ex_3;

public class Circle extends Ellipse{
    public Circle(int radius) {
        super(radius, radius);
    }

    @Override
    public String toString() {
        return "Circle{" +
                "radius=" + getA() +
                '}';
    }
}
