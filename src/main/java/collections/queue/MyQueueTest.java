package collections.queue;

import org.junit.Test;

class MyQueueTest {

    @Test(expected = NullPointerException.class)
    public void testMyQueue() {
        MyQueue<Integer> myQueue = new MyQueue<>();
        Integer elem = myQueue.getElement();
        myQueue.insert(1);
        myQueue.insert(3);
        //assert (1 == myQueue.getElement());
    }
}