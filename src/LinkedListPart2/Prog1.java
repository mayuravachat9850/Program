package LinkedListPart2;

/*
Print kth Node in Circular LL
Description
Write a Java program that prints the node at the kth position in a given circular linked list.
*/
import java.util.*;
import java.lang.*;
public class Prog1 {
    static Node head;
    static class Node {
        int data;
        Node next;
        Node(int i) {
            data = i;
            next = null;
        }
    }
    static Prog1 insert(Prog1 list, int data) {
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
        new_node.next = head;
        return list;
    }
    public static Node getNode(Node head, int k) {
        if (k <= 0 || head == null)
        return null;

        Node fractionalNode = null;

        // Traverse the given list
        int i = 0;
        for (Node temp = head; temp != null;
             temp = temp.next){

            // For every k nodes, we move
            // fractionalNode one step ahead.
            if (i % k == 0){

                // First time we see a multiple of k
                if (fractionalNode == null)
                    fractionalNode = head;
                else
                    fractionalNode = fractionalNode.next;
            }
            i++;
        }
        return fractionalNode;
    }
    public static void main(String[] args) {
        Prog1 list = new Prog1();
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();
        for(int i=0;i<n;i++)
            list = insert(list,sc.nextInt());
        int k=sc.nextInt();
        System.out.println(getNode(head,k).data);
    }
}