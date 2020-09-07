package com.tk.practice.amazon.grokkingthecodinginterview.breadthfirstsearch;

/*
Find the minimum depth of a binary tree. The minimum depth is the number of nodes along the shortest path from the root node to the nearest leaf node.
 */

import java.util.LinkedList;
import java.util.Queue;

public class MinimumDepthOfBinaryTree {
    public int findDepth(TreeNode root) {
        int minimumDepth = Integer.MAX_VALUE;
        if (root == null) {
            return 0;
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
                    minimumDepth = Math.min(minimumDepth, depth);
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
        return minimumDepth;
    }
}
