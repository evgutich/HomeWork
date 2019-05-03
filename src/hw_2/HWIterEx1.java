package hw_2;

import java.util.Scanner;

public class HWIterEx1 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.print("Введите число: ");
        int n = in.nextInt();
        int sum = 0;
        while (n > 0) {
            sum += n % 10;
            n = n / 10;
        }
        System.out.println("Сумма цифр равна: " + sum);
    }
}
