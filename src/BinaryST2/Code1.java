package BinaryST2;
/*Invert a Binary Tree*/

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

//class representing Structure of node in the binary tree
class treeNode {
    int data;
    treeNode left;
    treeNode right;

    treeNode(int value) {
        data = value;
        left = null;
        right = null;
    }
}

class Code2 {

    //prints the inorder traversal of the tree, whose root is passed
    public void inorder(treeNode node) {
        treeNode left = node.left;
        treeNode right = node.right;

        if (left != null) {
            this.inorder(left);
        }
        System.out.println(node.data);
        if (right != null) {
            this.inorder(right);
        }
    }

    //takes the root of a binary tree as input and returns the root of the inverted tree.
    treeNode invertTree(treeNode rootNode) {
        if (rootNode == null)
            return rootNode;

        /* recursive calls */
        treeNode left = invertTree(rootNode.left);
        treeNode right = invertTree(rootNode.right);

        /* swap the left and right pointers */
        rootNode.left = right;
        rootNode.right = left;

        return rootNode;

    }


    treeNode rootNode;

    public static void main(String args[]) {

        Code2 tree = new Code2();

        Scanner in = new Scanner(System.in);

        //number of elements
        int n = in.nextInt(), element;

        //queue used to create a binary tree
        Queue<treeNode> q = new LinkedList<treeNode>();

        // creating a new binary tree.
        tree.rootNode = new treeNode(in.nextInt());
        q.add(tree.rootNode);
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


        //Passing the root node of the tree to "invertTree" function to invert the tree
        tree.invertTree(tree.rootNode);

        //print the inorder traversal of the flattened tree
        tree.inorder(tree.rootNode);
    }
}
