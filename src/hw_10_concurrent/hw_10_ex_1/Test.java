package hw_10_concurrent.hw_10_ex_1;

public class Test {
    public static void main(String[] args) {
//        Thread first = new Thread(new Downloader());
//        Thread second = new Thread(new Downloader());
//        first.start();
//        second.start();

        Thread attributedThread = new Thread(new AttributedRunnable(),"Attributed Thread");
        attributedThread.setPriority(Thread.MIN_PRIORITY);
        attributedThread.start();
        System.out.println(attributedThread.getName() + " has priority: " + attributedThread.getPriority());
    }
}
