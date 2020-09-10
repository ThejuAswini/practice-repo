package com.tk.practice.datastructures.trees.binarysearchtrees;

/*

public class Search {
    public TreeNode searchBST(TreeNode root, int val) {
        if (root == null || root.val == val) {
            return root;
        }

        if (val > root.left.val){
            return searchBST(root.right, val);
        }
        else{
            return searchBST(root.left, val);
        }

    }
}

*/

public class Search {
    public TreeNode searchBST(TreeNode root, int val) {
        if (root == null || root.val == val){
            return root;
        }

        TreeNode node = root;
        while (node != null){
            if (val > node.val){
                if (node.right == null){
                    return root;
                }
                else {
                    node = node.right;
                }
            }
            else{
                if (node.left == null){
                    return root;
                }
                else{
                    node = node.left;
                }
            }
        }

        return root;
    }
}

