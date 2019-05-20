package hw_5_ex_1;

public class Circle {

    private int radius;
    private Point center;

    public Circle(int radius, int x, int y) {
        setRadius(radius);
        setCenter(x, y);
    }

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    public Point getCenter() {
        return center;
    }

    public void setCenter(int x, int y) {
        this.center = new Point(x, y);
    }

    public double getCircumference(){
        return 2*Math.PI*getRadius();
    }

    public double getSquare(){
        return Math.PI*Math.pow(getRadius(),2);
    }

}
