package hw_1;

import java.util.Scanner;

public class HW1FuncEx2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите размеры первого дома: ");
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        if (a > 0 && b > 0) {
            System.out.println("a=" + a + " b=" + b);
        } else {
            System.out.println("Размер стены дома не может иметь нулевое или отрицательное значение");
            System.exit(0);
        }
        System.out.println("Введите размеры второго дома: ");
        int c = scanner.nextInt();
        int d = scanner.nextInt();
        if (c > 0 && d > 0) {
            System.out.println("c=" + c + " d=" + d);
        } else {
            System.out.println("Размер стены дома не может иметь нулевое или отрицательное значение");
            System.exit(0);
        }
        System.out.println("Введите размеры участка: ");
        int e = scanner.nextInt();
        int f = scanner.nextInt();
        if (e > 0 && f > 0) {
            System.out.println("e=" + e + " f=" + f);
        } else {
            System.out.println("Размер стороны участка не может иметь нулевое или отрицательное значение");
            System.exit(0);
        }
        if ((a + c <= e) && (b + d <= f)) {
            System.out.println("Дома помещаются на участке");
        } else if ((a + d <= e) && (b + c <= f)) {
            System.out.println("Дома помещаются на участке");
        } else if ((a + c <= f) && (b + d <= e)) {
            System.out.println("Дома помещаются на участке");
        } else if ((a + d <= f) && (b + c <= e)) {
            System.out.println("Дома помещаются на участке");
        } else System.out.println("Дома не помещаются на участке");
    }
}
