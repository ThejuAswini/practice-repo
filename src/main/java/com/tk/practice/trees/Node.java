package com.tk.practice.trees;

public class Node {
    int data;
    Node left, right;
    Node() {}
    Node(int val){
        this.data = val;
    }
    Node(int val, Node left, Node right){
        this.data = val;
        this.left = left;
        this.right = right;
    }

    public void insert(int value){
        if (value <= data){
            if (left == null){
                left = new Node(value);
            }
            else{
                left.insert(value);
            }
        }
        else{
            if (right == null){
                right = new Node(value);
            }
            else{
                right.insert(value);
            }
        }
    }

    public boolean contains(int value){
        if (value == data) return true;
        else if (value < data){
            if (left == null) return false;
            else {
                left.contains(value);
            }
        }
        else {
            if (right == null) return false;
            else {
                right.contains(value);
            }
        }
        return true;
    }

    public void printInOrder(){
        if (left != null){
            left.printInOrder();
        }
        System.out.println(data);
        if (right != null){
            right.printInOrder();
        }
    }

    public void printPreOrder(){
        System.out.println(data);
        if (left != null){
            left.printPreOrder();
        }
        if (right != null){
            right.printPreOrder();
        }
    }

    public void printPostOrder(){
        if (left != null){
            left.printPostOrder();
        }
        if (right != null){
            right.printPostOrder();
        }
        System.out.println(data);
    }
}
