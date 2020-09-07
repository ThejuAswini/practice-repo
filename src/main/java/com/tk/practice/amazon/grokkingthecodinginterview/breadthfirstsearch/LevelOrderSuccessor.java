package com.tk.practice.amazon.grokkingthecodinginterview.breadthfirstsearch;

import java.util.LinkedList;
import java.util.Queue;

/*
Given a binary tree and a node, find the level order successor of the given node in the tree.
The level order successor is the node that appears right after the given node in the level order traversal.
TC: O(N) and SC: O(N)
 */
public class LevelOrderSuccessor {
    public TreeNode findSuccessor (TreeNode root, int key) {
        TreeNode successor = new TreeNode();

        if (root == null) {
            return null;
        }

        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);

        while (!queue.isEmpty()) {
            TreeNode curr = new TreeNode();
            int size = queue.size();

            for (int i = 0; i < size; i++) {
                curr = queue.remove();

                if (curr.left != null) {
                    queue.offer(curr.left);
                }
                if (curr.right != null) {
                    queue.offer(curr.right);
                }

                if (curr.val == key && !queue.isEmpty()) {
                    successor = queue.peek();
                    break;
                }
            }
        }
        return successor;
    }
}
