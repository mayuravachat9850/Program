package Stack;
/*Stack using Singly LL*/
import java.util.*;

public class Code1 {
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
        public Stack() {
            super();
            head = null;
        }
        public boolean isEmpty() {
            return head == null;
        }
        public void push(int data) {
            Node temp = new Node(data);
            temp.setNext(head);
            head = temp;
        }
        public int pop() {
            if (head == null) {
                return Integer.MIN_VALUE;
            }
            int data = head.getData();
            head = head.getNext();
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
    }
    public static void main(String[] args){
        Stack s= new Stack();
        Scanner in = new Scanner(System.in);
        int n = in .nextInt();
        for (int i = 0; i < n; i++) {
            s.push( in .nextInt());
        }
        int topElement = s.peek();
        if (topElement != -1)
            System.out.println(topElement);
        for (int i = 0; i < n; i++) {
            System.out.println(s.pop());
        }
    }
}