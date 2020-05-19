package com.iwuyc.leetcode.p001_p100;

public interface P021 {
    class Solution {
        public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
            ListNode result;
            ListNode cursor;
            if (l1.val < l2.val) {
                result = l1;
                cursor = l2;
            } else {
                result = l2;
                cursor = l1;
            }
            ListNode resultCursor = result;
            do {
                do {
                    if (resultCursor.val > cursor.val) {
                        ListNode tmpNext = resultCursor.next;
                        resultCursor.next = cursor;
                        resultCursor = resultCursor.next;
                        resultCursor.next = tmpNext;
                        cursor = cursor.next;
                        break;
                    }
                    resultCursor = resultCursor.next;
                } while (resultCursor != null);
                cursor = cursor.next;
            } while (cursor != null);

            return result;
        }


    }
}
