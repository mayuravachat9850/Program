package Tree;
/*Left View of Binary Tree*/
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

//class representing Structure of node in the binary tree
class treeNode {
    int data;
    treeNode left;
    treeNode right;

    public treeNode(int element) {
        data = element;
        left = null;
        right = null;
    }
}

//class used to print the left view of a binary tree
class Prog1 {
    static treeNode rootNode;
    static int maximumLevel = -1;

    //function which undergoes recursion to print the left view of the binary tree
    void printLeftView(treeNode currentNode, int currentLevel) {
        // Base Case
        if (currentNode == null) {
            return;
        }

        // If this level is visited for the first time
        if (maximumLevel < currentLevel) {
            System.out.println(currentNode.data);
            maximumLevel = currentLevel;
        }

        // Recurring for left and right subtrees
        printLeftView(currentNode.left, currentLevel + 1);
        printLeftView(currentNode.right, currentLevel + 1);
    }


    public static void main(String args[]) {

        Prog1 tree = new Prog1();

        //root node of the binary tree
        treeNode rootNode;

        Scanner in = new Scanner(System.in);

        //number of elements
        int n = in.nextInt(), element;

        //queue used to create a binary tree
        Queue<treeNode> q = new LinkedList<treeNode>();

        // creating a new binary tree.
        rootNode = new treeNode(in.nextInt());
        q.add(rootNode);
        treeNode cur = null;
        for (int i = 1; i < n; i++) {

            cur = q.remove();

            //Note: if the element is -1 then the node is null
            element = in.nextInt();
            if (element != -1) {
                cur.left = new treeNode(element);
                q.add(cur.left);
            }
            i++;

            //Note: if the element is -1 then the node is null
            element = in.nextInt();
            if (element != -1) {
                cur.right = new treeNode(element);
                q.add(cur.right);
            }
        }

        tree.printLeftView(rootNode, 0);
    }
}
