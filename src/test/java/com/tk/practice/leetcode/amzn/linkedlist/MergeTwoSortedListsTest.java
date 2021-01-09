package com.tk.practice.leetcode.amzn.linkedlist;

import org.junit.jupiter.api.Test;

class MergeTwoSortedListsTest {
    MergeTwoSortedLists testObj = new MergeTwoSortedLists();

    @Test
    void mergeTwoLists() {
        /*ListNode l1 = new ListNode(1);
        l1.next = new ListNode(2);
        l1.next.next = new ListNode(3);

        ListNode l2 = new ListNode(1);
        l2.next = new ListNode(3);
        l2.next.next = new ListNode(4);

        /*ListNode l1 = new ListNode(5);

        ListNode l2 = new ListNode(1);
        l2.next = new ListNode(2);
        l2.next.next = new ListNode(4); */

        ListNode l1 = new ListNode(-10);
        l1.next = new ListNode(-10);
        l1.next.next = new ListNode(-9);
        l1.next.next.next = new ListNode(-7);
        l1.next.next.next.next = new ListNode(-4);
        l1.next.next.next.next.next = new ListNode(1);
        l1.next.next.next.next.next.next = new ListNode(6);
        l1.next.next.next.next.next.next.next = new ListNode(6);


        ListNode l2 = new ListNode(-7);


        ListNode result = testObj.mergeTwoLists(l1, l2);

        while (result != null) {
            System.out.print(result.val + " ---> ");
            result = result.next;
        }
    }
}