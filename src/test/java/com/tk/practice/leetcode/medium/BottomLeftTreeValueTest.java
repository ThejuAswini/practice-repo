package com.tk.practice.leetcode.medium;

import com.tk.practice.leetcode.medium.BottomLeftTreeValue;
import com.tk.practice.leetcode.medium.TreeNode;
import org.junit.jupiter.api.Test;

class BottomLeftTreeValueTest {
    BottomLeftTreeValue testObj = new BottomLeftTreeValue();

    @Test
    void findBottomLeftValue() {
        TreeNode root = new TreeNode(2);
        root.left = new TreeNode(1);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(4);
        root.right.left = new TreeNode(5);
        root.right.right = new TreeNode(6);
        root.right.right.left = new TreeNode(7);

        System.out.println(testObj.findBottomLeftValue(root));
    }
}