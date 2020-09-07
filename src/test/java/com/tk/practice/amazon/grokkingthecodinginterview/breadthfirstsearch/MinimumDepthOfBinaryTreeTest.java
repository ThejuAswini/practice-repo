package com.tk.practice.amazon.grokkingthecodinginterview.breadthfirstsearch;

import org.junit.jupiter.api.Test;

class MinimumDepthOfBinaryTreeTest {
    MinimumDepthOfBinaryTree testObj = new MinimumDepthOfBinaryTree();

    @Test
    void findDepth() {
        TreeNode root = new TreeNode(12);
        root.left = new TreeNode(7);
        root.right = new TreeNode(1);
        root.left.left = new TreeNode(9);
        root.right.left = new TreeNode(10);
        root.right.right = new TreeNode(5);
        root.right.left.left = new TreeNode(11);

        System.out.println(testObj.findDepth(root));
    }
}