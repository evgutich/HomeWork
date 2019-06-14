package hw_12_patterns.Ex_2;

public class Market {
    public boolean pay(PayPalAccount payPalAccount, Integer amount){
        return pay(new PayPalAdapter(payPalAccount), amount);
    }

    public boolean pay(CreditCard creditCard, Integer amount){
        return pay(new CreditCardAdapter(creditCard), amount);
    }

    private boolean pay(PaymentAdapter paymentAdapter, Integer amount){
        System.out.println("Successfully paid " + amount + " $");
        return paymentAdapter.collectMoney(amount);
    }
}
