package multithreading.deadlock;

import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class RaceConditionExampleApplication {

    private static volatile AtomicInteger counter = null;

    public static void main(String[] args) {

        Lock lock = new ReentrantLock();

        new Thread(() -> {
            for (int i = 0; i < 10000; i++) {
                lock.lock();
                try {
                    counter.incrementAndGet();
                } finally {
                    lock.unlock();
                }
            }
            System.out.println(counter.get() + " - first thread.");
        }).start();

        new Thread(() -> {
            for (int i = 0; i < 10000; i++) {
                lock.lock();
                try {
                    counter.incrementAndGet();
                } finally {
                    lock.unlock();
                }
            }
            System.out.println(counter.get() + " - second thread.");
        }).start();
    }
}
