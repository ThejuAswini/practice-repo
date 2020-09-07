package com.tk.practice.amazon.grokkingthecodinginterview.breadthfirstsearch;

/*
Basic Tree node class for all the classes in this folder
 */
public class TreeNode {
    int val;
    TreeNode left, right;

    TreeNode() {};

    TreeNode (int val) {
        this.val = val;
    }

    TreeNode (int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
}
