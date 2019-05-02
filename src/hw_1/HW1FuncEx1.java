package hw_1;

import java.util.Scanner;

public class HW1FuncEx1 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите день: ");
        int day = scanner.nextInt();
        if (day >= 1 && day <= 31) {
            System.out.println("Введите месяц: ");
            int month = scanner.nextInt();
            if (month >= 1 && month <= 12) {
                System.out.println("Введите год: ");
                int year = scanner.nextInt();
                if (year >= 0) {
                    switch (month) {
                        case 2:
                            if ((year % 4 == 0) && (year % 100 != 0)) {
                                if (day > 29) {
                                    System.out.println("Invalid date form");
                                    break;
                                } else {
                                    if (day == 29) {
                                        day = 1;
                                        month++;
                                    } else day++;
                                }
                            } else if (year % 400 == 0) {
                                if (day > 29) {
                                    System.out.println("Invalid date form");
                                    break;
                                } else {
                                    if (day == 29) {
                                        day = 1;
                                        month++;
                                    } else day++;
                                }
                            } else {
                                if (day > 28) {
                                    System.out.println("Invalid date form");
                                    break;
                                } else {
                                    if (day == 28) {
                                        day = 1;
                                        month++;
                                    } else day++;
                                }
                            }
                            System.out.println(day + "." + month + "." + year + " г.");
                            break;
                        case 12:
                            if (day == 31) {
                                day = 1;
                                month = 1;
                                year++;
                            } else day++;
                            System.out.println(day + "." + month + "." + year + " г.");
                            break;
                        case 4:
                        case 6:
                        case 9:
                        case 11:
                            if (day > 30) {
                                System.out.println("Invalid date form");
                                break;
                            } else {
                                if (day == 30) {
                                    day++;
                                    month++;
                                } else day++;
                            }
                            System.out.println(day + "." + month + "." + year + " г.");
                            break;
                        default:
                            if (day == 31) {
                                day = 1;
                                month++;
                            } else day++;
                            System.out.println(day + "." + month + "." + year + " г.");
                            break;
                    }
                }
            } else System.out.println("Invalid date form");
        } else System.out.println("Invalid date form");
    }
}
