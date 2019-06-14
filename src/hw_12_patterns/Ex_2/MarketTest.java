package hw_12_patterns.Ex_2;

import java.time.LocalDate;

public class MarketTest {
    public static void main(String[] args) {
        CreditCard creditCard = new CreditCard("* 2302", LocalDate.now());
        PayPalAccount payPalAccount = new PayPalAccount("elonmusk@gmail.com", "RocketMan123");

        new Market().pay(creditCard, 200);
        new Market().pay(payPalAccount, 300);
    }
}
