package com.tk.practice.trees.binarytrees;

import java.util.*;

// #107. Binary Tree Level Order Traversal II

public class LevelOrderBottomUpTraversal {
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> result = new ArrayList<>();
        if (root == null){
            return result;
        }
        Queue<TreeNode> queue = new LinkedList<>();
        TreeNode curr;
        queue.add(root); //queue.offer(root)

        while(!queue.isEmpty()){
            List<Integer> nodesAtSameLevel = new ArrayList<>();
            int size = queue.size();
            for (int i = 0; i < size; i++) {
                curr = queue.remove(); //curr = queue.poll();
                nodesAtSameLevel.add(curr.val);
                if (curr.left != null) {
                    queue.add(curr.left);
                }
                if (curr.right != null) {
                    queue.add(curr.right);
                }
            }
            result.add(nodesAtSameLevel);
        }

        Collections.reverse(result);
        return result;
    }
}
