package Tree;
/*Similar Traversal*/
import java.io.*;
import java.util.*;
public class Prog3 {
    public static Scanner sc = new Scanner(System.in);
    public static PrintWriter out = new PrintWriter(System.out, true);
    public static int N = 200005;
    static ArrayList<ArrayList<Integer>> g = new ArrayList<ArrayList<Integer>>();
    public static ArrayList<Integer> a = new ArrayList<Integer>();
    public static ArrayList<Integer> b = new ArrayList<Integer>();

    public static ArrayList<Integer> c = new ArrayList<Integer>();
    static ArrayList<Integer> d = new ArrayList<Integer>();

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

    static void bfs() {
        Queue<Integer> q = new LinkedList<Integer>();
        q.add(0);
        while(q.size() > 0) {
            int x = q.poll();
            d.add(x);
            for(int i = 0; i < g.get(x).size(); i++) {
                q.add(g.get(x).get(i));
            }
        }
    }

    static long check(ArrayList<Integer> a1, ArrayList<Integer> a2) {
        long res = 0;
        for(int i = 0; i < a1.size(); i++) {
            res += Math.abs(a1.get(i) - a2.get(i));
        }
        return res;
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
        bfs();
        long res = (long)(1e18);
        res = Math.min(res, check(a, d));
        res = Math.min(res, check(b, d));
        res = Math.min(res, check(c, d));
        int mod = 1000000007;
        out.println(res % mod);
    }
}