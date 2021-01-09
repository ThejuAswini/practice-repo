package com.tk.practice.leetcode.amzn.linkedlist;

public class MergeTwoSortedLists {
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode temp2 = l2;
        ListNode dummyHead  = new ListNode();
        dummyHead.next = l1;
        ListNode prev = dummyHead;

        while (l1 != null) {

            if (l2 == null) {
                return dummyHead.next;
            }

            while (l2 != null && l1.val >= l2.val) {
                prev.next = l2;
                temp2 = temp2.next;
                l2.next = l1;
                l2 = temp2;
                prev = prev.next;
            }

            prev = l1;
            l1 = l1.next;
        }

        if (l1 == null && l2 != null) {
            prev.next = l2;
        }

        return dummyHead.next;
    }
}
