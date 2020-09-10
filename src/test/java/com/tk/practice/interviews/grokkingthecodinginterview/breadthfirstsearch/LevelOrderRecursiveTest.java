package com.tk.practice.interviews.grokkingthecodinginterview.breadthfirstsearch;

import org.junit.jupiter.api.Test;

class LevelOrderRecursiveTest {
    LevelOrderRecursive testObj = new LevelOrderRecursive();

    @Test
    void recursiveTraversal() {
        TreeNode root = new TreeNode(12);
        root.left = new TreeNode(7);
        root.right = new TreeNode(1);
        root.left.left = new TreeNode(9);
        root.left.right = new TreeNode(10);
        root.right.left = new TreeNode(5);
        root.right.left.left = new TreeNode(3);
        root.right.left.right = new TreeNode(13);

        System.out.println(testObj.recursiveTraversal(root));
    }
}