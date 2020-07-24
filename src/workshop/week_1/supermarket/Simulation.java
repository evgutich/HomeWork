package workshop.week_1.supermarket;

import java.util.ArrayList;
import java.util.Random;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;


public class Simulation {

    private static final Random globalRandom = new Random(System.currentTimeMillis());

    public synchronized int getRandomIntInRangeEnclosed(int min, int max) {
        return globalRandom.nextInt((max - min + 1) + min);
    }

    private final static int CUSTOMER_NUMBER = 5;
    private final static int DESK_NUMBER = 2;

    private int maxTimeS = 0;

    public final CustomerFactory customerFactory = new CustomerFactory(this, CUSTOMER_NUMBER);

    public final ArrayList<Desk> results = new ArrayList<>(DESK_NUMBER);

    public void perform() {
        ExecutorService executor = Executors.newFixedThreadPool(DESK_NUMBER);
        for (int i = 1; i <= DESK_NUMBER; i++) {
            executor.submit(new Desk(this, i));
        }

        executor.shutdown();
        try {
            executor.awaitTermination(20, TimeUnit.SECONDS);
        } catch (InterruptedException ex) {
            ex.printStackTrace();
        }
    }

    public void printResult() {

        for (Desk desk : results) {
            if (desk.getSpentTime() > maxTimeS) {
                maxTimeS = desk.getSpentTime();
            }
        }

        System.out.println("---------------- RESULTS ----------------");
        System.out.println(DESK_NUMBER + " desks served " + CUSTOMER_NUMBER + " customers in " + maxTimeS + " sec time");
    }

    public static void main(String[] args) {
        Simulation sim = new Simulation();
        sim.perform();
        sim.printResult();
    }
}

