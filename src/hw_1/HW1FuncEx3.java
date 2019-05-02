package hw_1;

import java.util.Scanner;

public class HW1FuncEx3 {

    public static boolean isPositive(double n) {
        if (n >= 0) {
            System.out.println("Уравнение имеет два корня, дискриминант положительный");
            return true;
        } else return false;
    }

    public static boolean isZero(double n) {
        if (n == 0) {
            System.out.println("Уравнение имеет один корень");
            return true;
        } else return false;
    }

    public static double discriminant(double a1, double b1, double c1) {
        return b1 * b1 - 4 * a1 * c1;
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите a: ");
        double a = scanner.nextDouble();
        System.out.print("Введите b: ");
        double b = scanner.nextDouble();
        System.out.print("Введите c: ");
        double c = scanner.nextDouble();
        double x1, x2;

        if (isPositive(discriminant(a, b, c))) {
            x1 = ((-b + Math.sqrt(discriminant(a, b, c))) / (2 * a));
            x2 = ((-b - Math.sqrt(discriminant(a, b, c))) / (2 * a));
            System.out.println("x1 = " + x1 + ", x2 =" + x2);
        } else if (isZero(discriminant(a, b, c))) {
            x1 = -b / 2 * a;
            System.out.println("x = " + x1);
        } else System.out.println("Уравнение не имеет корней, дискриминант отрицательный");
    }
}
