package multithreading.multithreadingTaskFromFile;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.PriorityBlockingQueue;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Main {

    private static File f = new File("test.txt");

    private final static Integer INITIAL_CAPACITY = 10;

    private final static List<Thread> threads = new ArrayList<>(INITIAL_CAPACITY);

    private static final BlockingQueue<String> queue = new PriorityBlockingQueue<>();

    private static final Lock lock = new ReentrantLock();

    public static void main(String[] args) {
        initThreads();

    }

    private static void initThreads() {
        for (int i = 0; i < 2; i++) {
            Thread thread = new Thread(getRunnableTask(f, lock));
            thread.setName("Thread - " + i);
            threads.add(thread);
        }

        for (Thread th : threads) {
            th.start();
        }
    }

    private static Runnable getRunnableTask(File f, Lock lock) {

        return () -> {
            try (BufferedReader reader = new BufferedReader(new FileReader(f))) {
                lock.lock();
                String line = reader.readLine();
                while (line != null) {
                    queue.add("Поток: " + Thread.currentThread().getName() + ". Файл: "
                            + f.getName() + ". Текст: " + line);
                    line = reader.readLine();
                }
                queue.forEach(System.out::println);
                lock.unlock();
            } catch (IOException e) {
                e.printStackTrace();
            }
        };
    }
}