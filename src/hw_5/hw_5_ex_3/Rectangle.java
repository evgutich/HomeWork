package hw_5.hw_5_ex_3;

public class Rectangle extends Quadrangle implements RectangleInterface {

    public Rectangle(int a, int b) {
        super(a, b, a, b);
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "a=" + getA() +
                ", b=" + getB() +
                '}';
    }

    @Override
    public double getDiagonal() {
        return Math.sqrt(Math.pow(getA(), 2) + Math.pow(getB(), 2));
    }

    @Override
    public boolean checkRectangle() {
        return true;
    }
}
