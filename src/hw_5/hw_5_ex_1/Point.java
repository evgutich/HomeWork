package hw_5.hw_5_ex_1;

public final class Point {

    private int x;
    private int y;

    public Point(int x, int y) {
        set(x, y);
    }

    public void set(int x, int y) {
        setX(x);
        setY(y);
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int[] getByld() {
        int[] coordinate = new int[]{getX(), getY()};
        return coordinate;
    }

    public double distance() {
        return Math.sqrt(Math.pow(getX(), 2) + Math.pow(getY(),2));
    }

    public Point translate(int divX, int divY) {
        setX(getX() + divX);
        setY(getY() + divY);
        return this;
    }

    public Point scale(int n) {
        return new Point(n * getX(), n * getY());
    }

    @Override
    public String toString() {
        return "Point{" +
                "x=" + getX() +
                ", y=" + getY() +
                '}';
    }
}
