package com.tk.practice.trees.binarytrees;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Stack;

/**Or use a LinkedList and add values to the head, then no reverse is needed.
 * the linked list contents get added like this:
 *
 * root
 * right, root
 * left, right, root
 * */

public class PostOrderTraversal {
    public List<Integer> postorderTraversal(TreeNode root) {
        List<Integer> nodes = new LinkedList<>();
        if (root == null) return nodes;

        Stack<TreeNode> stack = new Stack<>();
        TreeNode curr;
        stack.push(root);

        while(!stack.isEmpty()){
            curr = stack.pop();
            nodes.add(curr.val);

            if (curr.left != null){
                stack.push(curr.left);
            }

            if (curr.right != null){
                stack.push(curr.right);
            }
        }

        return nodes;


    }
}
