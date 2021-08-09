package LinkedListPart2;

/*
Reverse a Circular LL
Write a java program which takes in the size of the circular linked list and
        the nodes of the circular linked list as input and outputs the reversed circular linked list.*/
import java.util.*;
import java.lang.*;
public class HomeW1 {
    static Node head;
    static class Node {
        int data;
        Node next;
        Node(int i) {
            data = i;
            next = null;
        }
    }

    static HomeW1 insert(HomeW1 list, int data) {
        Node new_node = new Node(data);
        new_node.next = null;
        if (list.head == null)
            list.head = new_node;
        else {
            Node last = list.head;
            while (last.next != head) {
                last = last.next;
            }
            last.next = new_node;
        }
        new_node.next=head;
        return list;
    }
    static Node reverseCircular(Node headRef) {
        // if list is empty
        if (headRef == null)
            return null;

        // reverse procedure same as reversing a
        // singly linked list
        Node prev = null;
        Node current = headRef;
        Node next;
        do
        {
            next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        } while (current != (headRef));

        // adjutsing the links so as to make the
        // last node point to the first node
        (headRef).next = prev;
        headRef = prev;
        return headRef;
    }
    static void printCircular(Node head) {
        if (head == null)
            return;

        Node temp = head;
        do
        {
            System.out.print( temp.data + " ");
            temp = temp.next;
        } while (temp != head);
    }
    public static void main(String[] args) {
        HomeW1 list = new HomeW1();
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();
        for(int i=0;i<n;i++)
            list = insert(list,sc.nextInt());
        head = reverseCircular(head);
        printCircular(head);
    }
}