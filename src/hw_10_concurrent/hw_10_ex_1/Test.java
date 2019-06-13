package hw_10_concurrent.hw_10_ex_1;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Test {
    public static void main(String[] args) {

        ExecutorService executorService = Executors.newCachedThreadPool();
        executorService.execute(new Downloader("url1"));
        executorService.execute(new Downloader("url2"));
        executorService.execute(new Downloader("url3"));
        executorService.execute(new Downloader("url4"));

        Thread attributedThread = new Thread(new AttributedRunnable(),"Attributed Thread");
        attributedThread.setPriority(Thread.MIN_PRIORITY);
        attributedThread.start();
        System.out.println(attributedThread.getName() + " has priority: " + attributedThread.getPriority());
    }
}
