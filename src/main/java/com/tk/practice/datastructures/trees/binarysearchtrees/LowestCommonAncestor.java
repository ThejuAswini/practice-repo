package com.tk.practice.datastructures.trees.binarysearchtrees;

public class LowestCommonAncestor {
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        if (root == null || root == p || root == q) {
            return root;
        }

        if ((root.val - p.val) * (root.val - q.val) > 0){
            if (root.val - p.val > 0){
                return lowestCommonAncestor(root.left, p, q);
            }
            return lowestCommonAncestor(root.right, p, q);
        }

        return root;

    }
}
