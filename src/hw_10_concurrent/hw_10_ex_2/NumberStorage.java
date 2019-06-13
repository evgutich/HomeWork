package hw_10_concurrent.hw_10_ex_2;

import java.util.LinkedList;
import java.util.Random;
import java.util.concurrent.locks.ReentrantReadWriteLock;

public class NumberStorage {
    private final ReentrantReadWriteLock rwLock = new ReentrantReadWriteLock();
    private final ReentrantReadWriteLock.WriteLock writeLock = rwLock.writeLock();
    private final ReentrantReadWriteLock.ReadLock readLock = rwLock.readLock();
    private LinkedList<Integer> storage;
    private Random rnd = new Random();

    public NumberStorage(LinkedList<Integer> storage) {
        this.storage = storage;
    }

    public void produce() {
        while (true) {
            try {
                writeLock.lock();
                if (storage.size() < 10) {
                    System.out.println("Размер на момент добавления: " + storage.size());
                    storage.add(rnd.nextInt(100));
                    System.out.println("Число добавлено в хранилище");
                }
            } finally {
                writeLock.unlock();
            }
        }
    }

    public void consume() {
        while (true) {
            try {
                readLock.lock();
                try {
                    Thread.sleep(rnd.nextInt(10));
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                if (storage.size() != 0) {
                    System.out.println("Размер на момент считывания: " + storage.size());
                    storage.removeFirst();
                    System.out.println("Число считано из хранилища");
                }
            }finally {
                readLock.unlock();
            }
        }
    }
}
