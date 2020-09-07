package com.tk.practice.trees.binarytrees;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/*
Given a binary tree, return the inorder traversal of its nodes' values.

Example:

Input: [1,null,2,3]
   1
    \
     2
    /
   3

Output: [1,3,2]
 */
public class InOrderTraversal {
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> nodes = new ArrayList<>();
        if (root == null) return nodes;

        Stack<TreeNode> stack = new Stack<>();
        TreeNode curr;

        while(!stack.isEmpty() || root != null){
            while(root != null){
                stack.push(root);
                root = root.left;
            }
            curr = stack.pop(); // root = stack.pop();
            nodes.add(curr.val); //nodes.add(root.val);
            root = curr.right; // root = root.right;
        }

        return nodes;
    }
}
