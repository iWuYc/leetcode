package com.iwuyc.leetcode.p001_p100;

import java.util.Stack;

public interface P025 {
    class Solution {
        public ListNode reverseKGroup(ListNode head, int k) {
            if (head == null || k <= 0) {
                return head;
            }
            Stack<ListNode> stack = new Stack<>();
            ListNode cursor = head;
            ListNode result = null;
            ListNode lastCursor = head;
            while (cursor != null) {
                stack.push(cursor);
                cursor = cursor.next;
                stack.peek().next = null;
                if (stack.size() >= k) {
                    ListNode newList = stack.pop();
                    ListNode newListCursor = newList;
                    while (!stack.isEmpty()) {
                        newListCursor.next = stack.pop();
                        newListCursor = newListCursor.next;
                    }
                    if (result == null) {
                        result = newList;
                    } else {
                        lastCursor.next = newList;
                    }
                    lastCursor = newListCursor;
                }
            }
            if (!stack.isEmpty()) {
                ListNode newList = stack.pop();
                ListNode newListCursor = newList;
                while (!stack.isEmpty()) {
                    newListCursor.next = stack.pop();
                    newListCursor = newListCursor.next;
                }
                if (result == null) {
                    result = newList;
                } else {
                    lastCursor.next = newList;
                }
            }
            return result;
        }

        private ListNode newList(Stack<ListNode> listNodes) {
            ListNode newList = listNodes.pop();
            ListNode newListCursor = newList;
            while (!listNodes.isEmpty()) {
                newListCursor.next = listNodes.pop();
                newListCursor = newListCursor.next;
            }
            return newList;
        }
    }
}
