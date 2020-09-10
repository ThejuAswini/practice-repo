package com.tk.practice.leetcode.medium;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class BottomLeftTreeValue {
    public int findBottomLeftValue(TreeNode root) {
        int result;

        if (root == null) {
            return -1;
        }

        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);
        List<List<Integer>> nodes = new ArrayList<>();

        while (!queue.isEmpty()) {
            TreeNode curr = new TreeNode();
            int size = queue.size();
            List<Integer> level = new ArrayList<>();

            for (int i = 0; i < size; i++) {
                curr = queue.remove();

                if (curr.left != null) {
                    queue.offer(curr.left);
                }
                if (curr.right != null) {
                    queue.offer(curr.right);
                }

                level.add(curr.val);
            }
            nodes.add(level);
        }

        return nodes.get(nodes.size() - 1).get(0);
    }
}
