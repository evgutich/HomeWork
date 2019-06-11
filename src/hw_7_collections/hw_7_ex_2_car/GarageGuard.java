package hw_7_collections.hw_7_ex_2_car;

public class GarageGuard {
    public static void main(String[] args) {
        Car mazda = new Roadster("Mazda", "RX-7", 1.3, 1999);
        Car opel = new Hatchbaсk("Opel", "Astra", 1.4, 2000);
        Car opel2 = new Hatchbaсk("Opel", "Astra", 1.4, 2000);
        Car fiat = new Minivan("Fiat", "Multipla", 1.6, 2001);
        Car vw = new Sedan("VW", "Passat", 1.8, 2002);

        Garage danaMall = new Garage();
        danaMall.parking(mazda);
        danaMall.parking(opel);
        danaMall.parking(fiat);
        danaMall.parking(fiat);
        danaMall.parking(vw);
        danaMall.parking(opel2);

        danaMall.camera();

        danaMall.parking(fiat);
        danaMall.parking(fiat);
        danaMall.parking(fiat);

        System.out.println();
        danaMall.camera();

        danaMall.leavingGarage(fiat);
        System.out.println(danaMall.carsCount(fiat));

        danaMall.leavingGarage(mazda);
        System.out.println();
        danaMall.camera();
    }
}
