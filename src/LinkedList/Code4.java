package LinkedList;
/*Write a Java code to reverse a singly linked list having ‘n’ nodes and data corresponding to each of them.
Output of your code should be able to print the list in reverse order. */
import java.util.*;
class Code4 {
    Node head;
    static Node temp;
    class Node {
        int data;
        Node next;
        Node(int d) {
            data = d;
            next = null;
        }
    }

    public void push(int new_data) {
        Node temp = head;
        Node new_node = new Node(new_data);
        if (head == null) {
            head = new_node;
        } else {
            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = new_node;
        }
    }


    /*This method is just responsible for reversing, whatever be the input node.
    It will start to treat the input node as the starting node and will start to reverse the list from there */
    Node recursiveReverse(Node current, Node prev) {
        if (current == null) {
            return null;
        }
        if (current.next == null) {
            // You've reached the end, this is the new head
            current.next = prev;
            return current;
        }
        Node reverse = recursiveReverse(current.next, current);
        current.next = prev;
        return reverse;
    }
    /* This function prints contents of linked list
    starting from the head node */
    public void print() {
        Node tnode = head;
        while (tnode != null) {
            System.out.print(tnode.data + " ");
            tnode = tnode.next;
        }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Code4 obj = new Code4();
        int no = in.nextInt();
        for (int i = 0; i < no; i++) {
            obj.push(in.nextInt());
        }
        obj.recursiveReverse(obj.head, null);
        obj.print();
    }
}

