package com.tk.practice.interviews.grokkingthecodinginterview.breadthfirstsearch;

import org.junit.jupiter.api.Test;

class LevelOrderIterativeTest {
    LevelOrderIterative testObj = new LevelOrderIterative();

    @Test
    void iterativeTraversal() {
        TreeNode root = new TreeNode(12);
        root.left = new TreeNode(7);
        root.right = new TreeNode(1);
        root.left.left = new TreeNode(9);
        root.left.right = new TreeNode(10);
        root.right.left = new TreeNode(5);

        System.out.println(testObj.iterativeTraversal(root));
    }
}