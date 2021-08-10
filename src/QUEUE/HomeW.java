package QUEUE;
/*Reverse the queue*/

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;

class Source {
    static Queue<Integer> q = new LinkedList<Integer>();
    static Stack<Integer> s = new Stack<>();

    public static void func() {
        int size = q.size();
        for (int i = 0; i < size; i++) {
            s.push(q.remove());
        }
        for (int i = 0; i < size; i++) {
            q.add(s.pop());
        }
    }

    public static void main(String arg[]) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();

        for (int j = 0; j < n; j++) {
            q.add(in.nextInt());
        }
        func();
        System.out.println(q);
    }
}



