package multithreading.deadlock;

import java.lang.management.ManagementFactory;
import java.lang.management.ThreadInfo;
import java.lang.management.ThreadMXBean;
import java.util.Arrays;

public class DeadlockApplication {
    public static void main(String[] args) throws InterruptedException {
        Object x = new Object();
        Object y = new Object();

        Thread.sleep(1000);
        ThreadMXBean mxBean = ManagementFactory.getThreadMXBean();
        long[] deadlockedThreads = mxBean.findDeadlockedThreads();
        if (deadlockedThreads != null) {
            ThreadInfo[] threadInfo = mxBean.getThreadInfo(deadlockedThreads);
            Arrays.stream(threadInfo).forEach(System.out::println);
        }

        new Thread(() -> {
            synchronized (x) {
                System.out.println(Thread.currentThread().getName() + " is getting monitor of object X..");
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println(Thread.currentThread().getName() + " trying to get monitor of object Y..");
                synchronized (y) {
                    System.out.println(Thread.currentThread().getName() + "got monitor of object Y..");
                }
            }
        }).start();

        new Thread(() -> {
            synchronized (y) {
                System.out.println(Thread.currentThread().getName() + " is getting monitor of object Y..");
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println(Thread.currentThread().getName() + " trying to get monitor of object X..");
                synchronized (x) {
                    System.out.println(Thread.currentThread().getName() + "got monitor of object X..");
                }
            }
        }).start();
    }
}
