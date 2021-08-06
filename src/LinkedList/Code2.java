package LinkedList;
/*
Write a java program that takes a linked list as an input and prints the middle element of the linked list as output.
*/
import java.util.*;

public class Code2 {
    //Node with data variable and next
    class Node {
        int data;
        Node next;

        Node(int value) {
            data = value;
            next = null;
        }
    }

    //initialising head node 'head' to null
    public static Node head = null;

    public static Node last;

    //method to add the node at the end of the linked list
    public void add(int value) {
        // Assume head is the head of the linked list
        Node newNode = new Node(value);
        //if the linked list is empty then
        if (head == null) {
            head = new Node(value);
            return;
        }

        last = head;
        while (last.next != null) {
            last = last.next;
        }
        last.next = newNode;
        return;
    }
    //Method to print the middle element of the linked list
    public static void printMiddleElement(Node head) {
        int count = 0;
        Node mid = head;

        while (head != null)
        {

            // Update mid, when 'count'
            // is odd number
            if ((count % 2) == 1)
                mid = mid.next;

            ++count;
            head = head.next;
        }

        // If empty list is provided
        if (mid != null)
            System.out.println(mid.data);
    }
    public static void main(String[] arg) {
        Code2 obj = new Code2();
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        for (int i = 0; i < n; i++) {
            obj.add(in.nextInt());
        }
        printMiddleElement(obj.head);
    }
}
