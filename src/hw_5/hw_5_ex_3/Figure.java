package hw_5.hw_5_ex_3;

public abstract class Figure implements Calculator{

    public boolean equalsFigure(Figure figure) {
        return  (this.getSquare() == figure.getSquare());
    }

    public boolean checkTriangle(){
        return false;
    }

    public boolean checkRectangle(){
        return false;
    }
}
