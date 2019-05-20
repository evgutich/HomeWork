package hw_5_ex_1;

public class Rectangle {

    private int width;
    private int height;
    private Point angle;

    public Rectangle(int width, int height, int x, int y) {
        setWidth(width);
        setHeight(height);
        setAngle(x, y);
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public Point getAngle() {
        return angle;
    }

    public void setAngle(int x, int y) {
        this.angle = new Point(x, y);
    }

    public double getDiagonal() {
        return Math.sqrt(Math.pow(getWidth(), 2) + Math.pow(getHeight(), 2));
    }

    public int getSquare() {
        return getWidth() * getHeight();
    }
}
