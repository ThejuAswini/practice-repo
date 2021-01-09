package com.tk.practice.leetcode.amzn.treesandgraphs;

public class InOrderTraversals {
    //Recursive
    public void inOrderRecursive(TreeNode root) {
        if (root == null) {
            return;
        }

        inOrderRecursive(root.left);

        if (root != null) {
            System.out.print(root.val + " ---> ");
        }

        inOrderRecursive(root.right);
    }
}
