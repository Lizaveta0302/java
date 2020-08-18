package main.collections.linkedList;

public class LinkedList {
    private static int numNodes;
    private static Node head;

    public LinkedList(Object dat) {
        head = new Node(dat);
    }

    public void addAtHead(Object dat) {
        Node temp = head;
        head = new Node(dat);
        head.next = temp;
        numNodes++;
    }

    public void addAtTail(Object dat) {
        Node temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }

        temp.next = new Node(dat);
        numNodes++;
    }

    public void addAtIndex(int index, Object dat) {
        Node temp = head;
        Node holder;
        for (int i = 0; i < index - 1 && temp.next != null; i++) {
            temp = temp.next;
        }
        holder = temp.next;
        temp.next = new Node(dat);
        temp.next.next = holder;
        numNodes++;
    }

    public void deleteAtIndex(int index) {
        Node temp = head;
        for (int i = 0; i < index - 1 && temp.next != null; i++) {
            temp = temp.next;
        }
        temp.next = temp.next.next;
        numNodes--;
    }

    public static int find(Node n) {
        Node t = head;
        int index = 0;
        while (t != n) {
            index++;
            t = t.next;
        }
        return index;
    }

    public static Node find(int index) {
        Node temp = head;
        for (int i = 0; i < index; i++) {
            temp = temp.next;
        }
        return temp;
    }

    public static int getSize() {
        return numNodes;
    }

    class Node {
        private Node next;
        private Object data;

        public Node(Object dat) {
            data = dat;
        }

        public Object getData() {
            return data;
        }
    }
}