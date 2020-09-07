package com.tk.practice.amazon.grokkingthecodinginterview.breadthfirstsearch;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/*
Everything is same except, we will keep appending levels into the result in the beginning.. Since, an array list will shift all the elements every time,
which isn't optimal - so, will choose linked list and add the result every time at node 0
 */

/*
TC: O(N) since each node is processed exactly once
SC: O(N) to maintain the output structure which contains N nodes
The space complexity of the above algorithm will be O(N) as we need to return a list containing the level order traversal.
We will also need O(N) space for the queue. Since we can have a maximum of N/2 nodes at any level (this could happen only at the lowest level),
therefore we will need O(N)O(N) space to store them in the queue.
 */

public class ReverseLevelOrder {
    public List<List<Integer>> reverseLevelOrder(TreeNode root) {
         List<List<Integer>> result = new LinkedList<>();

        //edge cases
        if (root == null) return result;

        //Queue for storing children at each level
        Queue<TreeNode> queue = new LinkedList<>();

        //add the root to the queue
        //.add() throws an IllegalStateException if no space is currently available
        queue.offer(root);

        TreeNode curr;
        List<Integer> level;

        //loop through queue
        while(!queue.isEmpty()) {
            int size = queue.size(); // size changes later while adding children of nezt levels
            level = new ArrayList<>();

            //loop through the queue which has children of the same level
            for(int i = 0; i < size; i++) {
                curr = queue.remove();
                level.add(curr.val);

                //add the children of this node to the queue
                if (curr.left != null) {
                    queue.offer(curr.left);
                }
                if (curr.right != null) {
                    queue.offer(curr.right);
                }
            }

            result.add(0, level);
        }

        return result;
    }
}
