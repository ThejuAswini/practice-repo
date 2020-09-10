package com.tk.practice.datastructures.trees.binarytrees;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

  /*
  Given a binary tree, return the preorder traversal of its nodes' values.
  Input: [1,null,2,3]
   1
    \
     2
    /
   3

Output: [1,2,3]
   */
public class PreOrderTraversal {
    public List<Integer> preorderTraversal(TreeNode root) {

        List<Integer> nodes = new ArrayList<>();
        if (root == null) return nodes;
        Stack<TreeNode> stack = new Stack<>();
        stack.push(root);
        TreeNode curr;

        while(!stack.isEmpty()){
            curr = stack.pop();

            if (curr != null){
                nodes.add(curr.val);
                stack.push(curr.right);
                stack.push(curr.left);
            }

        }

        return nodes;

    }

}
