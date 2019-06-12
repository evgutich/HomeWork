package hw_8_exceptions;

import static hw_8_exceptions.ValueReader.readValues;
import static hw_8_exceptions.ValueReader.sumOfValues;

public class ValueReaderTest {
    public static void main(String[] args) {
//        try {
//            System.out.println(readValues());
//        }
//        catch (NumberFormatException e){
//            System.err.println("Введенные символы не соответствуют формату double");
//        }

        try {
            System.out.println(sumOfValues());
        } catch (Exception e) {
            System.err.println("Введенные символы не соответствуют формату double");
        }


    }
}
