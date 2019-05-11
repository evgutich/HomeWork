package hw_1;

import java.util.Scanner;

public class HW1FuncEx1 {

    private static void invalidDateForm() {
        System.out.println("Invalid date form");
    }

    private static void dateForm(int d, int m, int y) {
        System.out.println(d + "." + m + "." + y + " г.");
    }

    private static boolean isDayValid(int d) {
        return d >= 1 && d <= 31;
    }

    private static boolean isMonthValid(int m) {
        return m >= 1 && m <= 12;
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
                System.out.println("Введите день: ");
        int day = scanner.nextInt();
        if (!isDayValid(day)) {
            invalidDateForm();
            return;
        }
        System.out.println("Введите месяц: ");
        int month = scanner.nextInt();
        if (!isMonthValid(month)) {
            invalidDateForm();
            return;
        }

        System.out.println("Введите год: ");
        int year = scanner.nextInt();
        if (year >= 0) {
            switch (month) {
                case 2:
                    if ((year % 4 == 0) && (year % 100 != 0)) {
                        if (day > 29) {
                            invalidDateForm();
                            break;
                        } else {
                            if (day == 29) {
                                day = 1;
                                month++;
                            } else day++;
                        }
                    } else if (year % 400 == 0) {
                        if (day > 29) {
                            invalidDateForm();
                            break;
                        } else {
                            if (day == 29) {
                                day = 1;
                                month++;
                            } else day++;
                        }
                    } else {
                        if (day > 28) {
                            invalidDateForm();
                            break;
                        } else {
                            if (day == 28) {
                                day = 1;
                                month++;
                            } else day++;
                        }
                    }
                    dateForm(day, month, year);
                    break;
                case 12:
                    if (day == 31) {
                        day = 1;
                        month = 1;
                        year++;
                    } else day++;
                    dateForm(day, month, year);
                    break;
                case 4:
                case 6:
                case 9:
                case 11:
                    if (day > 30) {
                        invalidDateForm();
                        break;
                    } else {
                        if (day == 30) {
                            day++;
                            month++;
                        } else day++;
                    }
                    dateForm(day, month, year);
                    break;
                default:
                    if (day == 31) {
                        day = 1;
                        month++;
                    } else day++;
                    dateForm(day, month, year);
                    break;
            }
        }
    }
}
