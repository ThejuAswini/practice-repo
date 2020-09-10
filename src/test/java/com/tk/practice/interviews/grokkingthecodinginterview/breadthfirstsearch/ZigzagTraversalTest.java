package com.tk.practice.interviews.grokkingthecodinginterview.breadthfirstsearch;

import org.junit.jupiter.api.Test;

class ZigzagTraversalTest {
    ZigzagTraversal testObj = new ZigzagTraversal();

    @Test
    void zigZagTraversal() {
//        TreeNode root = new TreeNode(12);
//        root.left = new TreeNode(7);
//        root.right = new TreeNode(1);
//        root.left.left = new TreeNode(9);
//        root.left.right = new TreeNode(10);
//        root.right.left = new TreeNode(5);
//        root.right.right = new TreeNode(8);
//        root.left.left.left = new TreeNode(2);
//        root.left.right.right = new TreeNode(11);
//        root.right.right.left = new TreeNode(4);
//        root.right.right.right = new TreeNode(6);

        TreeNode root = new TreeNode(3);
        root.left = new TreeNode(9);
        root.right = new TreeNode(20);
        root.left.left = null;
        root.left.right = null;
        root.right.left = new TreeNode(15);
        root.right.right = new TreeNode(7);

        System.out.println(testObj.zigZagTraversal(root));
    }
}