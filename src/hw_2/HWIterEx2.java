package hw_2;

import java.util.Scanner;

public class HWIterEx2 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите число: ");
        int n = in.nextInt();
        int n1 = 1;
        int n2 = 1;
        int n0 = 0;
        System.out.println(n1);
        while (n > n2) {
            n0 = n1 + n2;
            n1 = n2;
            n2 = n0;
            System.out.println(n1);
        }
    }
}
