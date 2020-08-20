package com.tk.practice.linkedlist;

import java.sql.SQLOutput;

class Node {
    Integer val;
    Node next;

    Node() {
    }

    Node(int val) {
        this.val = val;
        this.next = null;
    }
}

public class DesignLinkedList {

    private Node head = null;

    //Initialize your data structure here.
    public DesignLinkedList() {
        head = new Node();
    }

    //Return node at given index
    private Node getNodeAtIndex(int index) {
        if (index < 0) return null;
        if (index == 0) return head;

        int count = 0;
        Node currentNode = head;
        while (count < index && currentNode != null) {
            currentNode = currentNode.next;
            count++;
        }
        return currentNode;
    }

    // Get the value of the index-th node in the linked list. If the index is invalid, return -1
    public int get(int index) {
        Node curr = getNodeAtIndex(index);
        return (curr != null) ? curr.val : -1;
    }

    // Add a node of value val before the first element of the linked list. After the insertion, the new node will be the first node of the linked list.
    public void addAtHead(int val) {

        Node newNode = new Node(val);

        if (head.val == null && head.next == null) {
            head = newNode;
            head.next = null;
        } else if (head.val != null) {
            newNode.next = head;
            head = newNode;
        }

    }

    // Append a node of value val to the last element of the linked list. */
    public void addAtTail(int val) {

        Node newNode = new Node(val);
        Node temp = head;

        while (temp.next != null) {
            temp = temp.next;
        }

        temp.next = newNode;
        temp = temp.next;
        temp.next = null;

    }

    // Add a node of value val before the index-th node in the linked list. If index equals to the length of linked list, the node will be appended to the end of linked list. If index is greater than the length, the node will not be inserted. */
    public void addAtIndex(int index, int val) {
        Node newNode = new Node(val);

        if (head == null){
            head = newNode;
        }

        if (head.val == null && head.next == null){
            head = newNode;
            head.next = null;
            return;
        }

        Node prev = getNodeAtIndex(index - 1);
        if (prev == null){
                newNode.next = head;
                head = newNode;
        }
         else {
             newNode.next = prev.next;
             prev.next = newNode;
        }
    }

    // Delete the index-th node in the linked list, if the index is valid. */
    public void deleteAtIndex(int index) {
        Node prev = getNodeAtIndex(index - 1);
        Node current = getNodeAtIndex(index);
        Node next = null;
        if (current != null) {
           next = current.next;
        }

        if (head == null) return; //empty linked list
        if (index == 0 && next == null){
            //one node linked list
            head = null;
            return;
        }
        //delete at tail
        if (current != null && current.next == null) {
            if (prev != null){
                prev.next = null;
            }
        }
        //delete at head
        if (prev != null) {
            prev.next = next;
        } else {
            head = next;
        }
    }

    public Node removeNthFromEnd(Node head, int n) {
        if (head  == null) return null;

        Node temp = head;
        int count = 1;

        while(temp.next != null) {
            temp = temp.next;
            count++;
        }

        deleteAtIndex(count - n);

        return head;

    }

}
