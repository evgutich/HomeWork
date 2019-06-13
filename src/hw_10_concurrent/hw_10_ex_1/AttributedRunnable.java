package hw_10_concurrent.hw_10_ex_1;

public class AttributedRunnable implements Runnable {

    @Override
    public void run() {
        print();
    }

    public void print() {
        for (int i = 0; i < 1000; i++) {
            System.out.println("A");
        }
    }
}
