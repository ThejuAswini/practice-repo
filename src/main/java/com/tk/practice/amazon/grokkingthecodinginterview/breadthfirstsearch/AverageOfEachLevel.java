package com.tk.practice.amazon.grokkingthecodinginterview.breadthfirstsearch;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/*
Given a binary tree, populate an array to represent the averages of all of its level
 */
public class AverageOfEachLevel {
    public List<Double> findLevelAverages(TreeNode root) {
        List<Double> result = new ArrayList<>();

        //edge case
        if (root == null) {
            return result;
        }

        //We need queue for level order traversal
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);

        while (!queue.isEmpty()) {
            TreeNode curr;
            int size = queue.size();
            double levelSum = 0.0;

            for (int i = 0; i < size; i++) {
                curr = queue.remove();
                levelSum += curr.val;

                if (curr.left != null) {
                    queue.offer(curr.left);
                }
                if (curr.right != null) {
                    queue.offer(curr.right);
                }
            }

            result.add(levelSum / size);
        }

        return result;
    }
}
