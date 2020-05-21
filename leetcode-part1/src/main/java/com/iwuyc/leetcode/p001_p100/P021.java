package com.iwuyc.leetcode.p001_p100;

public interface P021 {
    class Solution {
        public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
            if (l1 == null) {
                return l2;
            }
            if (l2 == null) {
                return l1;
            }
            ListNode big;
            ListNode little;
            if (l1.val < l2.val) {
                little = l1;
                big = l2;
            } else {
                little = l2;
                big = l1;
            }
            ListNode result = little;
            do {
                while (true) {
                    if (little.next == null || little.next.val > big.val) {
                        ListNode tmp = little.next;
                        little.next = big;
                        big = big.next;
                        little.next.next = tmp;
                        break;
                    }
                    little = little.next;
                }
            } while (big != null);

            return result;
        }


    }
}
