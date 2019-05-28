package hw_5.hw_5_ex_3;

public class RightTriangle extends Triangle {

    public RightTriangle(double a, double b) {
        super(a, b, Math.sqrt(Math.pow(a, 2) + Math.pow(b, 2)));
    }

    public double getHypotenuse() {
        return Math.sqrt(Math.pow(getA(), 2) + Math.pow(getB(), 2));
    }

    @Override
    public String toString() {
        return "Right triangle{" +
                "first cathetus=" + getA() +
                ", second cathetus=" + getB() +
                ", hypotenuse=" + getHypotenuse() +
                '}';
    }

}
