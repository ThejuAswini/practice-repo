package com.tk.practice.trees.binarytrees;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class AverageOfLevelsInBT {
    public List<Double> averageOfLevels(TreeNode root) {
        List<Double> result = new ArrayList<>();
        if (root == null){
            return result;
        }
        Queue<TreeNode> queue = new LinkedList<>();
        TreeNode curr;
        queue.add(root);
        while(!queue.isEmpty()){
            Double avgOfEachLevel;
            double sum = 0.0;
            int size = queue.size();
            for (int i = 0; i < size; i++) {
                curr = queue.remove();
                sum = sum + curr.val;
                if (curr.left != null) {
                    queue.add(curr.left);
                }
                if (curr.right != null) {
                    queue.add(curr.right);
                }
            }
            avgOfEachLevel = sum / size;
            result.add(avgOfEachLevel);
        }
        return result;
    }
}
