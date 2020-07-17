package workshop.week_1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PhoneNumberFormatter {
    private List<Integer> phoneNumber;

    public PhoneNumberFormatter(List<Integer> phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String stringNumber(List number) {
        return number.toString().replaceAll("[^0-9]+", "");
    }

    public String formatNumber(List phoneNumber) {
        String number = phoneNumber.toString().replaceAll("[^0-9]+", "");
        return "(" + number.substring(0, 3) + ")" + number.substring(3, 6) + "-" + number.substring(6, 10);
    }

    public String formatNumberRegEx(List phoneNumber) {
        String number = "";
        Pattern pattern = Pattern.compile("\\d+");
        Matcher matcher = pattern.matcher(phoneNumber.toString());
        while (matcher.find()) {
            number += matcher.group();
        }
        return String.format("(%s)%s-%s", number.substring(0, 3), number.substring(3, 6), number.substring(6, 10));
    }

    public static void main(String[] args) {
        PhoneNumberFormatter test = new PhoneNumberFormatter(new ArrayList(Arrays.asList(0, 1, 2, 3, 4, 5, 6, 7, 8, 9)));
        System.out.println(test.formatNumber(test.phoneNumber));
        System.out.println(test.formatNumberRegEx(test.phoneNumber));
    }
}

