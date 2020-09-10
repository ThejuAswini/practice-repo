package com.tk.practice.interviews.grokkingthecodinginterview.breadthfirstsearch;

import java.util.LinkedList;
import java.util.Queue;

/*
Find the maximum depth of a binary tree.
The maximum depth is the number of nodes along the longest path from the root node down to the farthest leaf node.
 */
public class MaximumDepthOfBinaryTree {
    public int maximumDepth(TreeNode root) {
        int maximumDepth = 0;

        if (root == null) {
            return maximumDepth;
        }

        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);
        int depth = 1;

        while (!queue.isEmpty()) {
            TreeNode curr = new TreeNode();
            int size = queue.size();

            for (int i = 0; i < size; i++) {
                curr = queue.remove();

                if (curr.left == null && curr.right == null) {
                    maximumDepth = Math.max(maximumDepth, depth);
                }

                if (curr.left != null) {
                    queue.offer(curr.left);
                }
                if (curr.right != null) {
                    queue.offer(curr.right);
                }

            }
            depth++;
        }

        return maximumDepth;
    }
}
