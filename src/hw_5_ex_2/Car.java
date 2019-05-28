package hw_5_ex_2;

public class Car {

    private double amountOfPetrol;
    private double fuelConsumption;
    private double mileage;

    public Car(double fuelConsumption) {
        setFuelConsumption(fuelConsumption);
    }

    public double getAmountOfPetrol() {
        return amountOfPetrol;
    }

    private void setAmountOfPetrol(double amountOfPetrol) {
        this.amountOfPetrol = amountOfPetrol;
    }

    protected double getFuelConsumption() {
        return fuelConsumption;
    }

    private void setFuelConsumption(double fuelConsumption) {
        this.fuelConsumption = fuelConsumption;
    }

    public double getMileage() {
        return mileage;
    }

    private void setMileage(double mileage) {
        this.mileage = mileage;
    }

    public void move(double km) {
        setMileage(getMileage() + km);
        setAmountOfPetrol(getAmountOfPetrol() - km * getFuelConsumption());
    }

    public void refueling(double litres) {
        setAmountOfPetrol(getAmountOfPetrol() + litres);
    }

}
