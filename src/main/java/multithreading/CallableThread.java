package multithreading;

import java.util.concurrent.Callable;

public class CallableThread implements Callable {

    private String threadName;

    public CallableThread(String threadName) {
        this.threadName = threadName;
    }

    @Override
    public Object call() {
        return 5;
    }

    public String getThreadName() {
        return threadName;
    }
}
