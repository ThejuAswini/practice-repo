package com.tk.practice.interviews.grokkingthecodinginterview.breadthfirstsearch;

import org.junit.jupiter.api.Test;

class MaximumDepthOfBinaryTreeTest {
    MaximumDepthOfBinaryTree testObj = new MaximumDepthOfBinaryTree();

    @Test
    void maximumDepth() {
        TreeNode root = new TreeNode(12);
        root.left = new TreeNode(7);
        root.right = new TreeNode(1);
        root.left.left = new TreeNode(9);
        root.right.left = new TreeNode(10);
        root.right.right = new TreeNode(5);
        root.right.left.left = new TreeNode(11);

        System.out.println(testObj.maximumDepth(root));
    }
}