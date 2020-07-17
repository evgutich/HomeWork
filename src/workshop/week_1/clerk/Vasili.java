package workshop.week_1.clerk;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Vasili implements Clerk {

    Map<Bill, Integer> cash = new HashMap<>();

    @Override
    public boolean giveChange(List<Customer> customers) {
        cash.put(Bill.HUNDRED, 0);
        cash.put(Bill.FIFTY, 0);
        cash.put(Bill.TWENTY_FIVE, 0);
        for (Customer customer : customers) {
            if (customer.getBill().getCost() == 100) {
                if (cash.get(Bill.TWENTY_FIVE) == 0) return false;
                else if (cash.get(Bill.FIFTY) != 0) {
                    cash.put(Bill.HUNDRED, cash.get(Bill.HUNDRED) + 1);
                    cash.put(Bill.FIFTY, cash.get(Bill.FIFTY) - 1);
                    cash.put(Bill.TWENTY_FIVE, cash.get(Bill.TWENTY_FIVE) - 1);
                } else if (cash.get(Bill.TWENTY_FIVE) >= 3) {
                    cash.put(Bill.HUNDRED, cash.get(Bill.HUNDRED) + 1);
                    cash.put(Bill.TWENTY_FIVE, cash.get(Bill.TWENTY_FIVE) - 3);
                }
            } else if (customer.getBill().getCost() == 50) {
                if (cash.get(Bill.TWENTY_FIVE) == 0) return false;
                else {
                    cash.put(Bill.FIFTY, cash.get(Bill.FIFTY) + 1);
                    cash.put(Bill.TWENTY_FIVE, cash.get(Bill.TWENTY_FIVE) - 1);
                }
            } else if (customer.getBill().getCost() == 25) {
                    cash.put(Bill.TWENTY_FIVE, cash.get(Bill.TWENTY_FIVE) + 1);
            }
        }
        return true;
    }
}
