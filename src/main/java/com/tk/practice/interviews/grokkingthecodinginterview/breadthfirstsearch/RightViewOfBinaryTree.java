package com.tk.practice.interviews.grokkingthecodinginterview.breadthfirstsearch;

/*
Given a binary tree, return an array containing nodes in its right view.
The right view of a binary tree is the set of nodes visible when the tree is seen from the right side.
 */

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/*
TC: O(N)
SC:O(N)
 */
public class RightViewOfBinaryTree {
    public static List<TreeNode> traverse(TreeNode root) {
        List<TreeNode> result = new ArrayList<>();

        if (root == null) return result;

        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);
        List<List<TreeNode>> nodes = new ArrayList<>();
        List<TreeNode> level;

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
                level.add(curr);
            }
            nodes.add(level);
        }
        for (List<TreeNode> node: nodes) {
            int len = node.size();
            TreeNode rightMostNode = node.get(len - 1);
            result.add(rightMostNode);
        }
        return result;
    }
}
