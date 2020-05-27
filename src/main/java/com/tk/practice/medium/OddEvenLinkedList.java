package com.tk.practice.medium;

/*
328. Odd Even Linked List

Given a singly linked list, group all odd nodes together followed by the even nodes. Please note here we are talking about the node number and not the value in the nodes.

You should try to do it in place. The program should run in O(1) space complexity and O(nodes) time complexity.

Example 1:
Input: 1->2->3->4->5->NULL
Output: 1->3->5->2->4->NULL

Example 2:
Input: 2->1->3->5->6->4->7->NULL
Output: 2->3->6->7->1->5->4->NULL

Note:
The relative order inside both the even and odd groups should remain as it was in the input.
The first node is considered odd, the second node even and so on ...
 */

import java.util.List;

class ListNode {
    int val;
    ListNode next;
    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}

public class OddEvenLinkedList {

    public ListNode oddEvenList(ListNode head) {

        if (head == null) return null;
        if (head.next == null || head.next.next == null) return head;

        // traverse the given linked list to obtain tail
        ListNode tail = head;
        while(tail.next != null){
            tail = tail.next;
        }

        ListNode temp;
        ListNode headTemp = head;
        ListNode tailTemp = tail;

        while(headTemp != null && headTemp != tail){

            if (headTemp.next == tail){
                temp = headTemp.next;
                headTemp.next = temp.next;

                tailTemp.next = temp;
                temp.next = null;
                tailTemp = tailTemp.next;
                break;
            }

            temp = headTemp.next;
            headTemp.next = temp.next;

            tailTemp.next = temp;
            temp.next = null;
            tailTemp = tailTemp.next;

            headTemp = headTemp.next;
        }

        return head;

    }
}
