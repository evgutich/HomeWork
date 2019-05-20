package hw_4;

import java.util.Scanner;

public class HWStringEx1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String str = in.nextLine();
        if (isPalindrome(str))
            System.out.println(str + " is palindrome");
        else
            System.out.println(str + " isn't palindrome");

    }

    public static boolean isPalindrome(String str) {
        boolean flag = false;
        for (int i = 0; i < str.length() / 2; i++) {
            if (str.charAt(i) == str.charAt(str.length() - 1 - i)) {
                flag = true;
            }
        }
        return flag;
    }
}
