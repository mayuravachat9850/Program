package LinkedListPart2;
/*
Doubly Circular Linked List
Description
Write a Java program to create a Doubly Circular linked list of ‘n’ nodes and corresponding ‘n’ data values.
After creating, traverse your list in forward and backward direction and print output of traversal in both directions.
 */
import java.util.*;
class Prog2 {
    Node head;
    // Creating structure for nodes
    static class Node{
        int data;
        Node next;
        Node prev;
    };
    // This method will push the input data at the end of the list
        void push(int data) {
            // List is empty so create a single node furst
            if (head == null) {
                Node new_node = new Node();
                new_node.data = data;
                new_node.next = new_node.prev = new_node;
                head = new_node;
                return;
            }

            // find last node in the list if list is not empty
            Node last = (head).prev;    //previous of head is the last node

            // create a new node
            Node new_node = new Node();
            new_node.data = data;

            // next of new_node will point to head since list is circular
            new_node.next = head;

            // similarly previous of head will be new_node
            (head).prev = new_node;

            // change new_node=>prev to last
            new_node.prev = last;

            // Make new node next of old last
            last.next = new_node;
        }

        void print() {
            Node temp = head;

            System.out.printf("\nTraversal in forward direction \n");
            while (temp.next != head) {
                System.out.printf("%d ", temp.data);
                temp = temp.next;
            }
            System.out.printf("%d ", temp.data);

            System.out.printf("\nTraversal in reverse direction \n");
            Node last = head.prev;
            temp = last;
            while (temp.prev != last) {
                System.out.printf("%d ", temp.data);
                temp = temp.prev;
            }
            System.out.printf("%d ", temp.data);
        }

        public static void main(String[] args) {
            Prog2 obj = new Prog2();
            Scanner in = new Scanner(System.in);
            int n = in.nextInt();
            for (int i = 0; i < n; i++) {
                obj.push(in.nextInt());
            }
            obj.print();
        }

}
