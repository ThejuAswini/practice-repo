package com.tk.practice.leetcode.amzn.linkedlist;

import org.junit.jupiter.api.Test;

class AddTwoNumbersInPlaceTest {
    AddTwoNumbersInPlace testObj = new AddTwoNumbersInPlace();

    @Test
    void addTwoNumbersWithCarry() {
        /*
        ListNode l1 = new ListNode(2);
        l1.next = new ListNode(4);

        ListNode l2 = new ListNode(5);
        l2.next = new ListNode(6);
        l2.next.next = new ListNode(4);
        */

        ListNode l1 = new ListNode(5);
        ListNode l2 = new ListNode(5);

        /*
        ListNode l1 = new ListNode(2);
        l1.next = new ListNode(4);
        l1.next.next = new ListNode(3);

        ListNode l2 = new ListNode(5);
        l2.next = new ListNode(6);
        l2.next.next = new ListNode(4);
         */
        ListNode result = testObj.addTwoNumbersWithCarry(l1,l2);

        while (result != null) {
            System.out.print(result.val);
            if (result.next != null) {
                System.out.print(" --> ");
            }
            result = result.next;
        }
    }
}