package com.tk.practice.amazon.grokkingthecodinginterview.breadthfirstsearch;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/*
TC: O(N) and SC: O(N)
 */
public class ZigzagTraversal {
    public List<List<Integer>> zigZagTraversal (TreeNode root) {
        List<List<Integer>> result = new ArrayList<>();

        //edge cases
        if (root == null) return result;

        //Queue to store nodes at each level
        Queue<TreeNode> queue = new LinkedList<>();

        //add the root to the queue
        queue.offer(root);
        TreeNode temp;
        List<Integer> level = null;
        boolean reverse = false;

        //loop through queue to process nodes until it is empty
        while (!queue.isEmpty()) {
            int size = queue.size();
            level = new LinkedList<>();

            //loop through the initial queue (which contains kids of the same level)
            for (int i = 0; i < size; i++) {
                temp = queue.poll();

                //add the node to the current level
                if (reverse) {
                    level.add(0, temp.val);
                }
                else {
                    level.add(temp.val);
                }

                //insert the children of current node in the queue
                if (temp.left != null) {
                    queue.offer(temp.left);
                }
                if (temp.right != null) {
                    queue.offer(temp.right);
                }
            }

            reverse = !reverse;

            result.add(level);
        }

        return result;
    }
}
