package Tree;
/*Median Traversals*/
import java.io.*;
import java.util.*;


public class Code2 {

    public static Scanner sc = new Scanner(System.in);
    public static PrintWriter out = new PrintWriter(System.out, true);


    public static int N = 200005;
    static ArrayList<ArrayList<Integer>> g = new ArrayList<ArrayList<Integer>>();
    public static ArrayList<Integer> a = new ArrayList<Integer>();
    public static ArrayList<Integer> b = new ArrayList<Integer>();

    public static ArrayList<Integer> c = new ArrayList<Integer>();

    public static void preorder(int v) {
        a.add(v);
        for(int i = 0; i < g.get(v).size(); i++) {
            preorder(g.get(v).get(i));
        }
    }

    static void postorder(int v) {
        for(int i = 0; i < g.get(v).size(); i++) {
            postorder(g.get(v).get(i));
        }
        c.add(v);
    }

    static void inorder(int v) {
        if(g.get(v).size() >= 1) {
            inorder(g.get(v).get(0));
        }
        b.add(v);
        if(g.get(v).size() >= 2) {
            inorder(g.get(v).get(1));
        }
    }



    public static void main(String[] args) {
        b = new ArrayList<Integer>();
        c = new ArrayList<Integer>();
        int n = sc.nextInt();
        n++;
        for(int i = 0; i < n; i++) {
            g.add(new ArrayList<Integer>());
        }
        for(int i = 1; i < n; i++) {
            int x = sc.nextInt();
            g.get(x).add(i);
        }
        for(int i = 0; i < n; i++) {
            Collections.sort(g.get(i));
        }
        preorder(0);
        inorder(0);
        postorder(0);
        long res = 0;
        for(int i = 0; i < n; i++) {
            ArrayList<Integer> d = new ArrayList<Integer>();
            d.add(a.get(i));
            d.add(b.get(i));
            d.add(c.get(i));
            Collections.sort(d);
            res += d.get(1);
        }
        int mod = 1000000007;
        out.println(res % mod);
    }
}