package LinkedListPart2;

/*
Split Circular LL
Description
Given a circular linked list having ‘n’ nodes along with data values in each of them.
 You have to split the list into two halves. If ‘n’ is odd, then the first half linked list should
 have one more node than the second half of the given linked list.
 */
import java.util.*;
class Prog3 {
    static Node head;
    static Node h1,h2;

    static class Node {
        int data;
        Node next, prev;

        Node(int d) {
            data = d;
            next = prev = null;
        }
    }
    void divide() {
        Node slow_ptr = head;
        Node fast_ptr = head;

        if (head == null) {
            return;
        }

        /* If there are odd nodes in the circular list then
         fast_ptr->next becomes head and for even nodes
         fast_ptr->next->next becomes head */
        while (fast_ptr.next != head
                && fast_ptr.next.next != head) {
            fast_ptr = fast_ptr.next.next;
            slow_ptr = slow_ptr.next;
        }

        /* If there are even elements in list then move fast_ptr */
        if (fast_ptr.next.next == head) {
            fast_ptr = fast_ptr.next;
        }

        /* Set the head pointer of first half */
        h1 = head;

        /* Set the head pointer of second half */
        if (head.next != head) {
            h2 = slow_ptr.next;
        }
        /* Make second half circular */
        fast_ptr.next = slow_ptr.next;

        /* Make first half circular */
        slow_ptr.next = head;
    }
    //Method to add nodes at the end of the list
    public void push(int new_data) {
        Node temp = head;
        Node new_node = new Node(new_data);
        if (head == null) {
            head = new_node;
            new_node.next=head;
        } else {
            while (temp.next != head) {
                temp = temp.next;
            }
            temp.next = new_node;
            new_node.next = head;
        }
    }


    //Method to print data value of nodes of the linked list
    void print(Node temp) {
        Node node = temp;
        if (temp != null) {
            do {
                System.out.print(node.data + " ");
                node = node.next;
            } while (node != temp);
        }
    }

    public static void main(String[] args) {
        Prog3 list = new Prog3();
        Scanner in= new Scanner(System.in);
        int n=in.nextInt();
        for(int i=0; i<n; i++) {
            list.push(in.nextInt());
        }
        list.divide();
        System.out.println("");
        list.print(h1);
        System.out.println("");
        list.print(h2);
    }
}
