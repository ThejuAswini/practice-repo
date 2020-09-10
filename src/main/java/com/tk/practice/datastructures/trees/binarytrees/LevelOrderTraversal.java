package com.tk.practice.datastructures.trees.binarytrees;

import java.util.*;

//Binary Tree Level Order Traversal

public class LevelOrderTraversal {
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> result = new ArrayList<>();
        if (root == null){
            return result;
        }
        Queue<TreeNode> queue = new LinkedList<>();
        TreeNode curr;
        queue.add(root);

        while(!queue.isEmpty()){
            List<Integer> nodesAtSameLevel = new ArrayList<>();
            int size = queue.size();
            for (int i = 0; i < size; i++) {
                curr = queue.remove();
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

        return result;
    }
}
