package hw_5.hw_5_ex_3;

public class Ellipse extends Figure {
    private int a;
    private int b;

    public Ellipse(int a, int b) {
        this.a = a;
        this.b = b;
    }

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    public int getB() {
        return b;
    }

    public void setB(int b) {
        this.b = b;
    }

    @Override
    public String toString() {
        return "Ellipse{" +
                "a=" + a +
                ", b=" + b +
                '}';
    }

    @Override
    public double getPerimeter() {
        return 4 * (Math.PI * getA() * getB() + (getA() - getB())) / (getA() + getB());
    }

    @Override
    public double getSquare() {
        return Math.PI * getA() * getB();
    }

}
