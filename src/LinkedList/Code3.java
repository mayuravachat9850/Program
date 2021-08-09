package LinkedList;

import java.util.*;

// Java program to remove duplicates from a sorted linked list

class Code3 {
    Node head;
    //class to create nodes.
    class Node {
        int data;
        Node next;
        Node(int d) {
            data = d;
            next = null;
        }
    }

    void noRepeat() {
        int flag = 0;
        /* This flag statement would change the value to 1 as soon as it finds even 1 element repeated. This would help to print that there are no repeated elements in the sequence, as required by the question.*/
        // a node that will help you traverse the linked list
        Node temp = head;
        // Pointer to store the next reference of a node to be deleted
        Node store_next;
        // if the head is null, the list is empty
        if (head == null) {
            System.out.println(" ");
            return;
        }
        // Traversing the list till the last node
        while (temp.next != null) {
            /*This if statement would execute if the data value of adjacent nodes are equal.*/
            if (temp.data == temp.next.data) {
                flag = 1;
                /* since the adjacent node has same data, you can delete the node next to temp but before that, you should store the reference of the next node that this node is pointing to. */
                store_next = temp.next.next;
                temp.next = null;
                temp.next = store_next;
            }
            else {
                /* this else statement would execute if the data value of the adjacent node is not equal.*/
                temp = temp.next;
            }
        }
        if (flag == 0) {
            print_list();
        } else {
            print_list();
        }
    }

    // Below methods would help you create a singly linked list.
    // inserts a new node at the end of the list.
    public void insert(int new_data) {
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

    // Method that will print the linked list.
    void print_list() {
        Node node = head;
        while (node != null) {
            System.out.print(node.data + " ");
            node = node.next;
        }
    }

    public static void main(String args[]) {
        Code3 obj = new Code3();
        Scanner in = new Scanner(System.in);
        int n = in .nextInt();

        for (int i = 0; i < n; i++) {
            obj.insert( in .nextInt());
        }
        obj.noRepeat();
    }
}