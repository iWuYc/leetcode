package com.iwuyc.leetcode.p001_p100;

public class ListNode {
    public int val;
    public ListNode next;

    public ListNode(int x) {
        val = x;
    }

    public static ListNode create(int... vals) {
        if (vals == null || vals.length == 0) {
            return null;
        }
        ListNode result = new ListNode(vals[0]);
        ListNode cursor = result;
        for (int i = 1; i < vals.length; i++) {
            cursor.next = new ListNode(vals[i]);
            cursor = cursor.next;
        }
        return result;
    }

    @Override
    public String toString() {
        StringBuilder strBuilder = new StringBuilder(String.valueOf(val));
        ListNode cursor = next;
        while (cursor != null) {
            strBuilder.append("->").append(cursor.val);
            cursor = cursor.next;
        }
        return strBuilder.toString();
    }

}
