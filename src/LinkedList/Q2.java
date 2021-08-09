package LinkedList;
/*Delete Node at Given Index in LL*/
import java.util.*;

public class Q2 {
    static Node head;

    static class Node {
        int data;
        Node next;

        Node(int n) {
            data = n;
            next = null;
        }
    }

    public static void main(String args[]) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        head = null;
        if (n > 0) {
            head = new Node(s.nextInt());
            Node temp = head;
            for (int i = 1; i < n; i++) {
                temp.next = new Node(s.nextInt());
                temp = temp.next;
            }
        }
        int index = s.nextInt();
        deleteNodeAtGivenIndex(index);
        while (head != null) {
            System.out.print(head.data + " ");
            head = head.next;
        }
    }
    // Method to delete the node at the given index of the LinkedList
    static void deleteNodeAtGivenIndex(int index) {
        if (head == null)
            return;

        // Store head node
        Node temp = head;

        // If head needs to be removed
        if (index == 0)
        {
            head = temp.next;   // Change head
            return;
        }

        // Find previous node of the node to be deleted
        for (int i=0; temp!=null && i<index-1; i++)
            temp = temp.next;

        // If position is more than number of nodes
        if (temp == null || temp.next == null)
            return;

        // Node temp->next is the node to be deleted
        // Store pointer to the next of node to be deleted
        Node next = temp.next.next;

        temp.next = next;  // Unlink the deleted node from list

    }

}
