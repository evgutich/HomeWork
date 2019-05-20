package hw_5_ex_1;

public class TestPoint {

    public static void main(String[] args) {

        Point p = new Point(3, 4).translate(1, 3).scale(2);
        System.out.println(p.toString());
        System.out.println(p.distance());

        Rectangle rec = new Rectangle(3,4,1,1);
        System.out.println(rec.getDiagonal());
        System.out.println(rec.getSquare());

        Circle circle = new Circle(10, 1, 1);
        System.out.println(circle.getCircumference());
        System.out.println(circle.getSquare());
    }

}
