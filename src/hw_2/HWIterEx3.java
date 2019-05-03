package hw_2;

import java.util.Scanner;

public class HWIterEx3 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите количество дней: ");
        int n = in.nextInt();
        int i = 0;
        int sum = 0;
        int downfall;
        int max = 0;
        while (n > i) {
            i++;
            System.out.println(i + " день. Введите количество осадков: ");
            downfall = in.nextInt();
            sum = sum + downfall;
            if (max < downfall) {
                max = downfall;
            }
        }
        System.out.println("Количество дней: " + n + ". Сумма осадков: " + sum + ". Среднее количество осадков: " + sum / n + ". Максимальное количество осадков: " + max + ".");
    }
}
