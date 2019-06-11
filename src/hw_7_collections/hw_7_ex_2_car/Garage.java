package hw_7_collections.hw_7_ex_2_car;

import java.util.HashMap;
import java.util.Map;

public class Garage {
    private Map<Car, Integer> garage = new HashMap<>();

    public void parking(Car car) {
        if (garage.get(car) == null) {
            garage.put(car, 1);
        } else {
            garage.put(car, garage.get(car) + 1);
        }
    }

    public void leavingGarage(Car car) {
        if (garage.get(car) == null) {
            System.out.println("This cars too poor to parking in garage");
        } else if (garage.get(car) == 1) {
            garage.remove(car);
        } else {
            garage.put(car, garage.get(car) - 1);
        }
    }

    public int carsCount(Car car) {
        return garage.get(car);
    }

    public void camera() {
        for (Map.Entry<Car, Integer> entry : garage.entrySet()) {
            System.out.println(entry.getKey().toString() + " " + entry.getValue());
        }
    }
}
