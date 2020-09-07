package com.tk.practice.trees.binarysearchtrees;

/*
//Recursive
public class Insert {
    public TreeNode insertIntoBST(TreeNode root, int val) {
        // if there is no root, add the node as root
        if (root == null){
            return new TreeNode(val);
        }

        // enter node into right subtree
        if (val > root.val){
            root.right = insertIntoBST(root.right, val);
        }

        // enter node into left subtree
        if (val < root.val){
            root.left = insertIntoBST(root.left, val);
        }

        return root;

    }
}

 */

public class Insert{
    public TreeNode insertIntoBST(TreeNode root, int val){
        TreeNode node = root;
        if (node == null){
            return new TreeNode(val);
        }

        while (node != null){
            if (val > node.val){
                if (node.right == null){
                    node.right = new TreeNode(val);
                    return root;
                }
                else{
                    node = node.right;
                }
            }
            else{
                if (node.left == null){
                    node.left = new TreeNode(val);
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

