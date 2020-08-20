package com.tk.practice.trees;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BinaryTreeTest {

    void randomTest(){
        BinaryTree testObj = new BinaryTree();
        testObj.root = new Node(1); // root is created

        /*
        Following is the tree after above statement
              1
            /   \
          null  null
         */

        testObj.root.left = new Node(2);
        testObj.root.right = new Node(3);

        /* 2 and 3 became left and right children of 1
               1
             /   \
            2      3
          /    \    /  \
        null null null null  */

        testObj.root.left.left = new Node(4);

        /* 4 becomes left child of 2
                    1
                /       \
               2          3
             /   \       /  \
            4    null  null  null
           /   \
          null null
         */

    }





}