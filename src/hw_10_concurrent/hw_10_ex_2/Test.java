package hw_10_concurrent.hw_10_ex_2;

import java.util.LinkedList;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Test {
    public static void main(String[] args) {
        ExecutorService executorService = Executors.newCachedThreadPool();
        LinkedList<Integer> storage = new LinkedList<>();
        executorService.submit(new NumberStorage(storage)::produce);
        executorService.submit(new NumberStorage(storage)::consume);
    }
}
