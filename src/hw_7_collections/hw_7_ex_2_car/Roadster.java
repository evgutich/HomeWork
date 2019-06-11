package hw_7_collections.hw_7_ex_2_car;

public class Roadster extends Car {
    public Roadster(String brand, String model, double engineCapacity, int manufacturedYear) {
        super(brand, model, "Roadster", engineCapacity, manufacturedYear);
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
