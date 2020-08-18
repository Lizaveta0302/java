package main.collections.queue;

import java.io.IOException;

public class MyQueue<T> {
    private Node<T> front;
    private Node<T> back;
    private int size;

    public MyQueue() {
        back = null;
        size = 0;
    }

    public void insert(T elem) {
        if (isEmpty()) {
            Node<T> node = new Node<>(null, null, elem);
            back = node;
            front = node;
            size++;
        } else {
            Node<T> node = new Node<>(front, null, elem);
            front.setNext(node);
            size++;
            front = node;
        }
    }

    public T getElement() {
        if (!isEmpty()) {
            T element = back.getElement();
            size--;
            back = back.getNext();
            return element;
        } else
            throw new NullPointerException();
    }

    private boolean isEmpty() {
        return size == 0;
    }

    public int getSize() {
        return size;
    }
}
