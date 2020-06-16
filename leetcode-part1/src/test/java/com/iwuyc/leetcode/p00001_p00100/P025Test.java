package com.iwuyc.leetcode.p00001_p00100;

import org.junit.Test;

public class P025Test {
    @Test
    public void solution1() {
        ListNode result;
        String str;
        ListNode listNode = ListNode.create(1, 2, 3, 4, 5);
        result = new P025.Solution().reverseKGroup(listNode, 2);
        str = result.printList();
        System.out.println(str);
        System.out.println("2->1->4->3->5".equals(str));

        listNode = ListNode.create(1, 2, 3, 4, 5);
        result = new P025.Solution().reverseKGroup(listNode, 3);
        str = result.printList();
        System.out.println(str);
        System.out.println("3->2->1->4->5".equals(str));
    }

    @Test
    public void solution2() {
        ListNode result;
        String str;
        ListNode listNode = ListNode.create(1, 2, 3, 4, 5);
        result = new P025.Solution2().reverseKGroup(listNode, 2);
        str = result.printList();
        System.out.println(str);
        System.out.println("2->1->4->3->5".equals(str));

        listNode = ListNode.create(1, 2, 3, 4, 5);
        result = new P025.Solution2().reverseKGroup(listNode, 3);
        str = result.printList();
        System.out.println(str);
        System.out.println("3->2->1->4->5".equals(str));

        listNode = ListNode.create(1, 2, 3, 4, 5);
        result = new P025.Solution2().reverseKGroup(listNode, 1);
        str = result.printList();
        System.out.println(str);
        System.out.println("1->2->3->4->5".equals(str));
    }
    @Test
    public void solution3() {
        ListNode result;
        String str;
        ListNode listNode = ListNode.create(1, 2, 3, 4, 5);
        result = new P025.Solution3().reverseKGroup(listNode, 2);
        str = result.printList();
        System.out.println(str);
        System.out.println("2->1->4->3->5".equals(str));

        listNode = ListNode.create(1, 2, 3, 4, 5);
        result = new P025.Solution3().reverseKGroup(listNode, 3);
        str = result.printList();
        System.out.println(str);
        System.out.println("3->2->1->4->5".equals(str));

        listNode = ListNode.create(1, 2, 3, 4, 5);
        result = new P025.Solution3().reverseKGroup(listNode, 1);
        str = result.printList();
        System.out.println(str);
        System.out.println("1->2->3->4->5".equals(str));
    }
}