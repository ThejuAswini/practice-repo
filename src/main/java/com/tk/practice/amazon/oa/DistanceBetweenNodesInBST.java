package com.tk.practice.amazon.oa;

public class DistanceBetweenNodesInBST {

    static class Node {
        Node left, right;
        int val;
        Node() {};
        Node(int val) {this.val = val;};
        Node(int val, Node left, Node right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }

    }

    public Node buildBST(Node root, int val) {
        if (root == null){
            return new Node(val);
        }
        else if (val > root.val) {
            root.right = buildBST(root.right, val);
        }
        else if (val < root.val) {
            root.left = buildBST(root.left, val);
        }

        return root;
    }
}
