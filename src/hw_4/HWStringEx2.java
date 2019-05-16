package hw_4;

import java.util.Scanner;

public class HWStringEx2 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String str = in.next();
        System.out.println(toArabic(str));
    }

    public static int toArabic(String number) {
        number.toUpperCase();
        int num = 0;
        if (number.equals("")) num = num + 0;
        if (number.startsWith("M")) num = 1000 + toArabic(remove(number, 1));
        if (number.startsWith("CM")) num = 900 + toArabic(remove(number, 2));
        if (number.startsWith("D")) num = 500 + toArabic(remove(number,1));
        if (number.startsWith("CD")) num = 400 + toArabic(remove(number, 2));
        if (number.startsWith("C")) num = 100 + toArabic(remove(number,1));
        if (number.startsWith("XC")) num = 90 + toArabic(remove(number, 2));
        if (number.startsWith("L")) num = 50 + toArabic(remove(number,1));
        if (number.startsWith("XL")) num = 40 + toArabic(remove(number, 2));
        if (number.startsWith("X")) num = 10 + toArabic(remove(number,1));
        if (number.startsWith("IX")) num = 9 + toArabic(remove(number,2));
        if (number.startsWith("V")) num = 5 + toArabic(remove(number,1));
        if (number.startsWith("IV")) num = 4 + toArabic(remove(number, 2));
        if (number.startsWith("I")) num = 1 + toArabic(remove(number,1));
        return num;
    }

    public static String remove(String str, int numChars) {
        char[] strToChar = str.toCharArray();
        char[] newChar = new char[strToChar.length - numChars];
        int charCount = 0;
        for (int i = numChars; i <= strToChar.length - 1; i++) {
            newChar[charCount] = strToChar[i];
            charCount++;
        }
        String newStr = new String(newChar);
        return newStr;
    }
}
