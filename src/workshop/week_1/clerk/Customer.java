package workshop.week_1.clerk;

public class Customer {
    private Bill bill;

    public Customer(Bill bill) {
        this.bill = bill;
    }

    public Bill getBill() {
        return bill;
    }
}
