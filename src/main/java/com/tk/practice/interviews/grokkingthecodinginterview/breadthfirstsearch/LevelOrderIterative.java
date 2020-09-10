package com.tk.practice.interviews.grokkingthecodinginterview.breadthfirstsearch;

/*
Given a binary tree, populate an array to represent its level-by-level traversal.
 */

/*
TC: O(N) since each node is processed exactly once
SC: O(N) to maintain the output structure which contains N nodes
The space complexity of the above algorithm will be O(N) as we need to return a list containing the level order traversal.
We will also need O(N) space for the queue. Since we can have a maximum of N/2 nodes at any level (this could happen only at the lowest level),
therefore we will need O(N)O(N) space to store them in the queue.
 */

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class LevelOrderIterative {
    public List<List<Integer>> iterativeTraversal (TreeNode root) {
        List<List<Integer>> result = new ArrayList<>();

        //edge cases
        if (root == null) return result;

        //Queue to store nodes at each level
        Queue<TreeNode> queue = new LinkedList<>();

        //add the root to the queue
        queue.offer(root);
        TreeNode temp;
        List<Integer> level;

        //loop through queue to process nodes until it is empty
        while (!queue.isEmpty()) {
            level = new ArrayList<>();
            int size = queue.size();

            //loop through the initial queue (which contains kids of the same level)
            for (int i = 0; i < size; i++) {
                temp = queue.remove();

                //add the node to the current level
                level.add(temp.val);

                //insert the children of current node in the queue
                if (temp.left != null) {
                    queue.offer(temp.left);
                }
                if (temp.right != null) {
                    queue.offer(temp.right);
                }
            }
            result.add(level);
        }

        return result;
    }
}
