package hw_5.hw_5_ex_3;

public class EquilateralTriangle extends Triangle implements EquiteralTriangleInterface{
    public EquilateralTriangle(double a) {
        super(a, a, a);
    }

    @Override
    public String toString() {
        return "Equilateral triangle{" +
                "a=" + getA() +
        '}';
    }

    @Override
    public double getHeight(){
        return getA()*Math.sqrt(3)/2;
    }

}
