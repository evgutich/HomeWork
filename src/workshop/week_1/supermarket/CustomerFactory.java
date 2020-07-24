package workshop.week_1.supermarket;

public class CustomerFactory {

    private Simulation simulation;
    private int capacity;

    public CustomerFactory(Simulation simulation, int capacity) {
        this.simulation = simulation;
        this.capacity = capacity;
    }

    public synchronized Customer getInstanceWithRandomCapacity() {
        if (capacity-- >= 1) {
            return new Customer(this.simulation.getRandomIntInRangeEnclosed(1, 10));
        } else {
            return null;
        }
    }
}
