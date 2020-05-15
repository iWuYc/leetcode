package com.iwuyc.leetcode.p001_p100;

import org.junit.Test;

/**
 * @author iWuYc
 */
public class P004Test {

    /**
     * 3.0
     */
    @Test
    public void test() {
        int[] nums1 = {1, 2};
        int[] nums2 = {3, 4, 7};
        System.out.println(new P004().findMedianSortedArrays(nums1, nums2));
    }

    /**
     * 2.5
     */
    @Test
    public void test1() {
        int[] nums1 = {1, 2};
        int[] nums2 = {3, 4};
        System.out.println(new P004().findMedianSortedArrays(nums1, nums2));
    }

    /**
     * 2.0
     */
    @Test
    public void test2() {
        int[] nums1 = {1, 3};
        int[] nums2 = {2};
        System.out.println(new P004().findMedianSortedArrays(nums1, nums2));
    }

    /**
     * 3.5
     */
    @Test
    public void test3() {
        int[] nums1 = {1, 2, 7};
        int[] nums2 = {3, 4, 5};
        System.out.println(new P004().findMedianSortedArrays(nums1, nums2));
    }

    /**
     * 5.5
     */
    @Test
    public void test4() {
        int[] nums1 = {6, 7};
        int[] nums2 = {1, 2, 3, 4, 5, 8, 9, 10};
        System.out.println(new P004().findMedianSortedArrays(nums1, nums2));
    }

    /**
     * 2.0
     */
    @Test
    public void test5() {
        int[] nums1 = {2};
        int[] nums2 = {};
        System.out.println(new P004().findMedianSortedArrays(nums1, nums2));
    }
}
