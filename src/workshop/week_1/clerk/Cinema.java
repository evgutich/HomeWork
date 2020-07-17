package workshop.week_1.clerk;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static workshop.week_1.clerk.Bill.*;

public class Cinema {
    public static void main(String[] args) {
        Vasili vasili = new Vasili();
        List<Customer> customers = new ArrayList<>(Arrays.asList(new Customer(FIFTY), new Customer(TWENTY_FIVE), new Customer(HUNDRED), new Customer(TWENTY_FIVE), new Customer(FIFTY)));
        System.out.println(vasili.giveChange(customers));
    }
}
