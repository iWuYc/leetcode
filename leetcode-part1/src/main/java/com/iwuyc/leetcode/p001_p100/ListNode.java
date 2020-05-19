package com.iwuyc.leetcode.p001_p100;

public class ListNode {
    public int val;
    public ListNode next;

    public ListNode(int x) {
        val = x;
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
