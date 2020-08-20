package com.tk.practice.trees;

// First Simple Tree with root (1) -> children 2, 3 -> 2's child 4

public class BinaryTree {
    Node root;

    BinaryTree(int data){
        root = new Node(data);
    }

    BinaryTree(){
        root = null;
    }
}
