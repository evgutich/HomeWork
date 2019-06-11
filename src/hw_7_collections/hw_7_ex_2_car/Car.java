package hw_7_collections.hw_7_ex_2_car;

import java.util.Objects;

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
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Car car = (Car) o;
        return Double.compare(car.engineCapacity, engineCapacity) == 0 &&
                manufacturedYear == car.manufacturedYear &&
                brand.equals(car.brand) &&
                model.equals(car.model) &&
                bodyStyle.equals(car.bodyStyle);
    }

    @Override
    public int hashCode() {
        return Objects.hash(brand, model, bodyStyle, engineCapacity, manufacturedYear);
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
