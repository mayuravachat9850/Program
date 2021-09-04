package BinaryST2;
/*Symmetric Binary Tree*/
import java.util.*;

//class representing Structure of node in the binary tree
class tree {
    int data;
    treeNode left, right;

    tree(int value) {
        data = value;
        left = null;
        right = null;
    }
}

public class C2 {
    treeNode rootNode;

    /* Below function takes the root and returns true
    if it is symmetric otherwise returns false.*/
    public boolean checkIsSymmetric(treeNode rootNode) {
        /* This allows adding null elements to the queue */
        Queue<treeNode> q = new LinkedList<treeNode>();

        /* Initially, add left and right nodes of rootNode */
        q.add(rootNode.left);
        q.add(rootNode.right);

        while (!q.isEmpty()) {
            /* Remove the two nodes from the queue and store in temporary variables */
            treeNode one = q.remove();
            treeNode two = q.remove();

            /* If both the nodes are null then check for other elements in the queue*/
            if (one == null && two == null)
                continue;

            /* If one node is null and other is not null, then return false*/
            if ((one == null && two != null) || (one != null && two == null))
                return false;

            /* if both nodes key values are different then return false*/
            if (one.data != two.data)
                return false;

            /*Since we have to compare the left subtree of node one
            and right subtree of node two, do the following*/
            q.add(one.left);
            q.add(two.right);

            /*Since we have to compare the right subtree of node one
             and left subtree of node two, do the following*/
            q.add(one.right);
            q.add(two.left);
        }

        /* If the program executes the loop and reaches here, then
        it means the binary tree is symmetric. Therefore, return true.*/
        return true;
    }


    public static void main(String[] args) {

        C2 binaryTree = new C2();

        Scanner in = new Scanner(System.in);

        //number of elements
        int n = in.nextInt(), element;

        //queue used to create a binary tree
        Queue<treeNode> q = new LinkedList<treeNode>();

        // creating a new binary tree.
        binaryTree.rootNode = new treeNode(in.nextInt());
        q.add(binaryTree.rootNode);
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


        //if the binary tree is symmetric, print true
        if (binaryTree.checkIsSymmetric(binaryTree.rootNode))
            System.out.println("true");

            //else, print false
        else
            System.out.println("false");
    }
}


