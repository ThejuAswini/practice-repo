package com.tk.practice.leetcode.amzn.treesandgraphs;

import org.junit.jupiter.api.Test;

class InOrderTraversalsTest {
    InOrderTraversals testObj = new InOrderTraversals();

    @Test
    void inOrderRecursive() {
        TreeNode root = new TreeNode('F');
        root.left = new TreeNode('B');
        root.right = new TreeNode('G');
        root.left.left = new TreeNode('A');
        root.left.right = new TreeNode('D');
        root.left.right.left = new TreeNode('C');
        root.left.right.right = new TreeNode('E');
        root.right.right = new TreeNode('I');
        root.right.right.left = new TreeNode('H');

        testObj.inOrderRecursive(root);
    }
}