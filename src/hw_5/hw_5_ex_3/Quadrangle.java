package hw_5.hw_5_ex_3;

public class Quadrangle extends Figure {
    private int a;
    private int b;
    private int c;
    private int d;

    public Quadrangle(int a, int b, int c, int d) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
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

    public int getC() {
        return c;
    }

    public void setC(int c) {
        this.c = c;
    }

    public int getD() {
        return d;
    }

    public void setD(int d) {
        this.d = d;
    }

    @Override
    public String toString() {
        return "Quadrangle{" +
                "a=" + a +
                ", b=" + b +
                ", c=" + c +
                ", d=" + d +
                '}';
    }

    @Override
    public double getSquare() {
        double p = getPerimeter() / 2;
        return Math.sqrt((p - getA()) * (p - getB()) * (p - getC()) * (p - getD()));
    }

    @Override
    public double getPerimeter() {
        return getA() + getB() + getC() + getD();
    }
}
