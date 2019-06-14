package hw_12_patterns.Ex_2;

import java.time.LocalDate;

public class CreditCard {
    private String number;
    private LocalDate expiration;

    public CreditCard(String number, LocalDate expiration) {
        this.number = number;
        this.expiration = expiration;
    }

    public String authorizeTransaction(Integer amount){
        return "Authorization code: as2321";
    }
}
