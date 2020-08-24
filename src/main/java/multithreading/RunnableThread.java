package multithreading;

public class RunnableThread implements Runnable {

    private String threadName;

    public RunnableThread(String threadName) {
        this.threadName = threadName;
        System.out.println("Thread " + threadName + " is created.");
    }

    @Override
    public void run() {
        System.out.println("Thread " + threadName + " is running.");
    }

    public String getThreadName() {
        return threadName;
    }
}
