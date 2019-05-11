package hw_1;

import java.util.Scanner;

public class HW1FuncEx2 {

    static void housePlaced() {
        System.out.println("Дома помещаются на участке");
    }
    static void sizeNotValid() {
        System.out.println("Размер не может иметь нулевое или отрицательное значение");
    }


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите размеры первого дома: ");
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        if (a > 0 && b > 0) {
            System.out.println("a=" + a + " b=" + b);
        } else {
            sizeNotValid();
            System.exit(0);
        }
        System.out.println("Введите размеры второго дома: ");
        int c = scanner.nextInt();
        int d = scanner.nextInt();
        if (c > 0 && d > 0) {
            System.out.println("c=" + c + " d=" + d);
        } else {
            sizeNotValid();
            System.exit(0);
        }
        System.out.println("Введите размеры участка: ");
        int e = scanner.nextInt();
        int f = scanner.nextInt();
        if (e > 0 && f > 0) {
            System.out.println("e=" + e + " f=" + f);
        } else {
            sizeNotValid();
            System.exit(0);
        }
        if ((a + c <= e) && (b + d <= f)) {
            housePlaced();
        } else if ((a + d <= e) && (b + c <= f)) {
            housePlaced();
        } else if ((a + c <= f) && (b + d <= e)) {
            housePlaced();
        } else if ((a + d <= f) && (b + c <= e)) {
            housePlaced();
        } else System.out.println("Дома не помещаются на участке");
    }
}
