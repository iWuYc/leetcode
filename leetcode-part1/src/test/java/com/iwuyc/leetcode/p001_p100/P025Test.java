package com.iwuyc.leetcode.p001_p100;

import org.junit.Test;

import static org.junit.Assert.*;

public class P025Test {
    @Test
    public void name() {
        ListNode result;
        String str;
        ListNode listNode = ListNode.create(1, 2, 3, 4, 5);
//        result = new P025.Solution().reverseKGroup(listNode, 2);
//        str = result.toString();
//        System.out.println(str);
//        System.out.println("2->1->4->3->5".equals(str));

        listNode = ListNode.create(1, 2, 3, 4, 5);
        result = new P025.Solution().reverseKGroup(listNode, 3);
        str = result.toString();
        System.out.println(str);
        System.out.println("3->2->1->4->5".equals(str));
    }
}