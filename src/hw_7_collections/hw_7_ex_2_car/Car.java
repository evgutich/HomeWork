package hw_7_collections.hw_7_ex_2_car;

public abstract class Car {
    private String brand;
    private String model;
    private String bodyStyle;
    private double engineCapacity;
    private int manufacturedYear;

    public Car(String brand, String model, String bodyStyle, double engineCapacity, int manufacturedYear) {
        this.brand = brand;
        this.model = model;
        this.bodyStyle = bodyStyle;
        this.engineCapacity = engineCapacity;
        this.manufacturedYear = manufacturedYear;
    }

    @Override
    public String toString() {
        return bodyStyle + "{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", engineCapacity=" + engineCapacity +
                ", manufacturedYear=" + manufacturedYear +
                '}';
    }
}
