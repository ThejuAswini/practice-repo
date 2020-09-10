package com.tk.practice.leetcode.medium;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class BinaryTreeRightSideView {
    public List<Integer> rightSideView(TreeNode root) {
        List<Integer> result = new ArrayList<>();

        if (root == null) return result;

        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);
        List<List<Integer>> nodes = new ArrayList<>();
        List<Integer> level;

        while (!queue.isEmpty()) {
            TreeNode curr = new TreeNode();
            int size = queue.size();
            level = new ArrayList<>();
            for (int i = 0; i < size; i++) {
                curr = queue.poll();

                if (curr != null && curr.left != null) {
                    queue.offer(curr.left);
                }
                if (curr != null && curr.right != null) {
                    queue.offer(curr.right);
                }
                level.add(curr.val);
            }
            nodes.add(level);
        }
        for (List<Integer> node: nodes) {
            int len = node.size();
            int rightMostNode = node.get(len - 1);
            result.add(rightMostNode);
        }
        return result;
    }
}
