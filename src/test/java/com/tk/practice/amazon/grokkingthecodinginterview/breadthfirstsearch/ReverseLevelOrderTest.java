package com.tk.practice.amazon.grokkingthecodinginterview.breadthfirstsearch;

import org.junit.jupiter.api.Test;

class ReverseLevelOrderTest {
    ReverseLevelOrder testObj = new ReverseLevelOrder();

    @Test
    void reverseLevelOrder() {
        TreeNode root = new TreeNode(12);
        root.left = new TreeNode(7);
        root.right = new TreeNode(1);
        root.left.left = new TreeNode(9);
        root.left.right = new TreeNode(10);
        root.right.left = new TreeNode(5);

        System.out.println(testObj.reverseLevelOrder(root));
    }
}