package hw_5.hw_5_ex_3;

public final class ShapeUtils {
    private ShapeUtils() {
    }

    public static boolean checkRectangle (Figure figure){
        return figure instanceof Rectangle;
    }

    public static boolean checkTriangle (Figure figure){
        return figure instanceof Triangle;
    }
}
