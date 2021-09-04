package Stack;
/*
Detect duplicate parenthesis
*/
import java.util.*;
public class Code4 {
    public static class Node {
        private char data;
        private Node next;

        Node(char data) {
            super();
            this.data = data;
        }
        public char getData() {
            return data;
        }
        public void setData(char data) {
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
        public void push(char data) {
            Node temp = new Node(data);
            temp.setNext(head);
            head = temp;
        }
        public char pop() {
            if (head == null) {
                return '\0';
            }
            char data = head.getData();
            head = head.getNext();
            return data;
        }
        public char peek()
        {
            if (!isEmpty()) {
                return head.data;
            }
            else {
                System.out.println(" ");
                return '\0';
            }
        }
    }

    public static String findDuplicateParenthesis(String inputString) {
        Stack stack = new Stack();
        for (int i = 0; i < inputString.length(); i++) {
            char ch = inputString.charAt(i);
            if (ch != ')') {
                stack.push(ch);
            }
            else {
                char top = stack.peek();
                stack.pop();
                int count = 0;
                while (top != '(') {
                    top = stack.peek();
                    stack.pop();
                    count++;
                }
                if (count <= 1) {
                    return "present";
                }
            }
        }
        return "absent";
    }

    public static void main(String[] args){
        Code4 obj = new Code4();
        String inputString = new String();
        Scanner in = new Scanner(System.in);
        inputString = in.nextLine();
        System.out.println(obj.findDuplicateParenthesis(inputString));
    }
}