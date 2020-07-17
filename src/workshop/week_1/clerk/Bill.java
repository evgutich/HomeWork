package workshop.week_1.clerk;

public enum Bill {
    HUNDRED(100),
    FIFTY(50),
    TWENTY_FIVE(25);

    private final int cost;

    Bill(int cost) {
        this.cost = cost;
    }

    public int getCost() {
        return cost;
    }
}
