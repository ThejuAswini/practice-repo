package com.tk.practice.leetcode.medium;

public class TreeNode {

        public int val;
        public TreeNode left, right;

        public TreeNode() {};

        public TreeNode (int val) {
            this.val = val;
        }

        public TreeNode (int val, com.tk.practice.leetcode.medium.TreeNode left, com.tk.practice.leetcode.medium.TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }

}
