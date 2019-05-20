package hw_5_ex_2;

class Car {

    private double amountOfPetrol;
    private double fuelConsumption;
    private double mileage;

    protected Car(double fuelConsumption) {
        setFuelConsumption(fuelConsumption);
    }

    protected double getAmountOfPetrol() {
        return amountOfPetrol;
    }

    protected void setAmountOfPetrol(double amountOfPetrol) {
        this.amountOfPetrol = amountOfPetrol;
    }

    protected double getFuelConsumption() {
        return fuelConsumption;
    }

    protected void setFuelConsumption(double fuelConsumption) {
        this.fuelConsumption = fuelConsumption;
    }

    protected double getMileage() {
        return mileage;
    }

    protected void setMileage(double mileage) {
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
