package QUEUE;

import java.util.*;
public class Program3 {
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

    public static class Stack {
        Node head;
        private int currentSize; // number of items
        public Stack() {
            super();
            head = null;
            currentSize = 0;
        }
        public boolean isEmpty() {
            return head == null;
        }
        public void push(int data) {
            Node temp = new Node(data);
            temp.setNext(head);
            head = temp;
            currentSize++;
        }
        public int pop() {
            if (head == null) {
                return Integer.MIN_VALUE;
            }
            int data = head.getData();
            head = head.getNext();
            currentSize--;
            return data;
        }
        public int peek()
        {
            if (!isEmpty()) {
                return head.data;
            }
            else {
                System.out.println(" ");
                return -1;
            }
        }
        public int size(){
            return currentSize;
        }
    }

    Stack stack = new Stack();
    Stack stack1 = new Stack();
    //The basic push and pop method of a stack are used to create enqueue and dequeue function of a queue
    public void enQueue(int newData){
        while (!stack.isEmpty())
        {
            stack1.push(stack.pop());
            //stack.pop();
        }

        // Push item into s1
        stack.push(newData);

        // Push everything back to s1
        while (!stack1.isEmpty())
        {
            stack.push(stack1.pop());
            //stack.pop();
        }
    }

    //Function to deQueue an item from queue
    public void deQueue(){
        if (stack.isEmpty())
        {
            System.out.println("Q is Empty");
            System.exit(0);
        }

        // Return top of s1
        int x = stack.peek();
        stack.pop();
        System.out.println(x);
    }
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        Program3 obj = new Program3();
        int n=in.nextInt();
        for(int i=0;i<n;i++) {
            obj.enQueue(in.nextInt());
        }
        obj.deQueue();
        obj.deQueue();
        obj.deQueue();
    }
}