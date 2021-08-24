package QUEUE;
/*Stack using Single Queue*/
import java.util.*;

public class Program2 {
    public static class Node {
        private int data;
        private Node next;

        Node(int data) {
            super();
            this.data = data;
        }

        public int getData() {
            return data;
        }

        public void setData(int data) {
            this.data = data;
        }

        public Node getNext() {
            return next;
        }

        public void setNext(Node next) {
            this.next = next;
        }
    }
    public static class Queue {
        Node head;
        Node tail;
        public Queue() {
            super();
            head = null;
            tail = null;
        }
        public boolean isEmpty() {
            return head == null;
        }
        public void enQueue(int data) {
            Node node = new Node(data);
            if (tail == null) {
                tail = node;
                head = node;
            } else {
                tail.setNext(node);
                tail = tail.getNext();
            }
        }
        public int deQueue() {
            int data = head.getData();
            head = head.getNext();
            if (head == null) { // it means it has got empty
                tail = null;
            }

            return data;
        }
    }

    public static void main(String[] args){
        Queue Q = new Queue();
        Scanner in = new Scanner(System.in);
        int n = in .nextInt();
        /*Enter the elements of the stack */
        for (int i = 0; i < n; i++) {
            Q.enQueue(in .nextInt());
        }
        for (int i = 0; i < n; i++) {
            System.out.println(Q.deQueue());
        }
    }
}