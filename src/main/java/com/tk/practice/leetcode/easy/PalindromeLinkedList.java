package com.tk.practice.leetcode.easy;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class PalindromeLinkedList {
    public boolean isPalindrome(ListNode head) {
        List<Integer> list = new ArrayList<>();

        list = getLinkedList(head);

        //Use two-pointer technique
        int start = 0;
        int end = list.size() - 1;

        while (start < end) {
            //we are comparing Integer
            if (!list.get(start).equals(list.get(end))) {
                return false;
            }
            start++;
            end--;
        }

        return true;

    }

    public List<Integer> getLinkedList(ListNode head) {
        ListNode curr = head;
        List<Integer> result = new ArrayList<>();

        while (curr != null) {
            result.add(curr.val);
            curr = curr.next;
        }

        return result;
    }
}
