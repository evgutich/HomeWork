package hw_5.hw_5_ex_1;

public class TestPoint {

    public static void main(String[] args) {

        hw_5.hw_5_ex_1.Point p = new hw_5.hw_5_ex_1.Point(3, 4).translate(1, 3).scale(2);
        System.out.println(p.toString());
        System.out.println(p.distance());

        hw_5.hw_5_ex_1.Rectangle rec = new hw_5.hw_5_ex_1.Rectangle(3,4,1,1);
        System.out.println(rec.getDiagonal());
        System.out.println(rec.getSquare());

        hw_5.hw_5_ex_1.Circle circle = new hw_5.hw_5_ex_1.Circle(10, 1, 1);
        System.out.println(circle.getCircumference());
        System.out.println(circle.getSquare());
    }

}
