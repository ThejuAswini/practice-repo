package com.tk.practice.interviews.grokkingthecodinginterview.breadthfirstsearch;

import org.junit.jupiter.api.Test;

class AverageOfEachLevelTest {
    AverageOfEachLevel testObj = new AverageOfEachLevel();

    @Test
    void findLevelAverages() {

        TreeNode root = new TreeNode(12);
        root.left = new TreeNode(7);
        root.right = new TreeNode(1);
        root.left.left = new TreeNode(9);
        root.left.right = new TreeNode(2);
        root.right.left = new TreeNode(10);
        root.right.right = new TreeNode(5);

        /*TreeNode root = new TreeNode(12);
        root.left = new TreeNode(7);
        root.right = new TreeNode(1);
        root.left.left = new TreeNode(9);
        root.left.right = new TreeNode(10);
        root.right.left = new TreeNode(5);
        root.right.right = new TreeNode(8);
        root.left.left.left = new TreeNode(3);
        root.left.right.right = new TreeNode(11);
        root.right.right.left = new TreeNode(4);
        root.right.right.right = new TreeNode(6); */

        System.out.println(testObj.findLevelAverages(root));
    }
}