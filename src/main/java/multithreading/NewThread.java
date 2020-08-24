package multithreading;

public class NewThread extends Thread {

    private String threadName;

    public NewThread(String threadName) {
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
