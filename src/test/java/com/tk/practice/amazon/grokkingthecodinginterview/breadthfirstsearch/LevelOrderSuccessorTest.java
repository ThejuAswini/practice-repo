package com.tk.practice.amazon.grokkingthecodinginterview.breadthfirstsearch;

import org.junit.jupiter.api.Test;

class LevelOrderSuccessorTest {
    LevelOrderSuccessor testObj = new LevelOrderSuccessor();

    @Test
    void findSuccessor() {
        TreeNode root = new TreeNode(12);
        root.left = new TreeNode(7);
        root.right = new TreeNode(1);
        root.left.left = new TreeNode(9);

        TreeNode result = testObj.findSuccessor(root, 1);
        System.out.println(result.val);
    }
}