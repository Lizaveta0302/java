package collections.blockingQueue;

import java.util.LinkedList;
import java.util.List;

public class BlockingQueue {
    private List<Object> queue = new LinkedList<>();
    private int limit = 10;

    public BlockingQueue(int limit) {
        this.limit = limit;
    }

    public synchronized Object insert(Object item) throws InterruptedException {
        while (this.queue.size() == this.limit) {
            wait();
        }
        if (this.queue.size() == 0) {
            notifyAll();
        }
        return this.queue.add(item);
    }

    public synchronized void remove() throws InterruptedException {
        while (this.queue.size() == 0) {
            wait();
        }
        if (this.queue.size() == limit) {
            notifyAll();
        }
        this.queue.remove(0);
    }
}
