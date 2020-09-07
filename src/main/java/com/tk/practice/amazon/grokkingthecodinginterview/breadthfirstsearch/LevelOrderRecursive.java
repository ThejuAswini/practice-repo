package com.tk.practice.amazon.grokkingthecodinginterview.breadthfirstsearch;

/*
Given a binary tree, populate an array to represent its level-by-level traversal.
 */

/*
TC: O(N) since each node is processed exactly once
SC: O(N) to maintain the output structure which contains N nodes
 */

import java.util.ArrayList;
import java.util.List;

public class LevelOrderRecursive {
    private List<List<Integer>> levels = new ArrayList<>();

    public List<List<Integer>> recursiveTraversal (TreeNode root) {
        if (root == null) {
            return levels;
        }
        helper(root, 0);
        return levels;
    }

    private void helper(TreeNode node, int level) {
        //start at the current level
        if (levels.size() == level) {
            levels.add(new ArrayList<Integer>());
        }

        //fill the current level
        levels.get(level).add(node.val);

        //process child nodes for the next level
        if (node.left != null) {
            helper(node.left, level + 1);
        }
        if (node.right != null) {
            helper(node.right, level + 1);
        }
    }
}
