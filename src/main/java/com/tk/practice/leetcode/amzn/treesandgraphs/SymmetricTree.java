package com.tk.practice.leetcode.amzn.treesandgraphs;

public class SymmetricTree {
    public boolean isSymmetric(TreeNode root) {
        if (root == null) {
            return true;
        }

        return check(root.left, root.right);
    }

    public boolean check(TreeNode leftSub, TreeNode rightSub) {
        if (leftSub == null && rightSub == null) {
            return true;
        }
        else if(leftSub == null || rightSub == null) {
            return false;
        }

        return (leftSub.val == rightSub.val) && check(leftSub.left,rightSub.right) && check(leftSub.right,rightSub.left);
    }
}
