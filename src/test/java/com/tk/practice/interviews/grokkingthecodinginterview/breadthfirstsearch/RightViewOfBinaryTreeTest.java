package com.tk.practice.interviews.grokkingthecodinginterview.breadthfirstsearch;

import org.junit.jupiter.api.Test;

import java.util.List;

class RightViewOfBinaryTreeTest {
    RightViewOfBinaryTree testObj = new RightViewOfBinaryTree();

    @Test
    void traverse() {
        TreeNode root = new TreeNode(12);
        root.left = new TreeNode(7);
        root.right = new TreeNode(1);
        root.left.left = new TreeNode(9);
        root.right.left = new TreeNode(10);
        root.right.right = new TreeNode(5);
        root.left.left.left = new TreeNode(3);
        List<TreeNode> result = RightViewOfBinaryTree.traverse(root);
        for (TreeNode node : result) {
            System.out.print(node.val + " ");
        }
    }
}