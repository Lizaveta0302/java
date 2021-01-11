package tasks;

public class MyLinkedList {

    Node head;

    public void add(String value) {
        if (head == null) {
            head = new Node(value);
            return;
        }
        Node tail = head;
        while (tail.next != null) {
            tail = tail.next;
        }

        tail.next = new Node(value);
    }

    public String getLastElement(int n) {
        Node smart = head;
        Node slow = head;
        int counter = 0;

        while (smart.next != null) {
            smart = smart.next;
            counter++;
            if (counter >= n) {
                slow = slow.next;
            }
        }
        return slow.value;
    }

    public String getMiddleElement() {
        Node smart = head;
        Node slow = head;
        int length = 0;

        while (smart.next != null) {
            smart = smart.next;
            length++;
            if (length % 2 == 0) {
                slow = slow.next;
            }
        }
        return slow.value;
    }

    public void reverseIteratively() {

        Node current = head;
        Node forward;
        Node previous = null;

        while (current.next != null) {

            forward = current.next;
            current.next = previous;

            previous = current;

            current = forward;
        }

        head = current;
        head.next = previous;
    }

    private Node reverseRecursively(Node node) {

        Node newHead;
        if (node.next == null) {
            return node;
        }
        newHead = reverseRecursively(node.next);

        node.next.next = node;
        node.next = null;
        return newHead;
    }

    public void reverseRecursively() {
        head = reverseRecursively(head);
    }

    @Override
    public String toString() {
        StringBuilder st = new StringBuilder();

        Node curr = head;

        while (curr != null) {
            st.append(curr.value).append("->");
            curr = curr.next;
        }
        return st.toString();
    }

    private static class Node {
        Node next;
        String value;

        public Node(String value) {
            this.value = value;
        }

    }
}
