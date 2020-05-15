package com.iwuyc.leetcode.p001_p100;

import org.junit.Test;

public class P004_betterTest {

    /**
     * 3.0
     */
    @Test
    public void test() {
        int[] nums1 = {1, 2};
        int[] nums2 = {3, 4, 7};
        findMedianSortedArrays(nums1, nums2);
    }

    /**
     * 2.5
     */
    @Test
    public void test1() {
        int[] nums1 = {1, 2};
        int[] nums2 = {3, 4};
        findMedianSortedArrays(nums1, nums2);
    }

    /**
     * 2.0
     */
    @Test
    public void test2() {
        int[] nums1 = {1, 3};
        int[] nums2 = {2};
        findMedianSortedArrays(nums1, nums2);
    }

    /**
     * 3.5
     */
    @Test
    public void test3() {
        int[] nums1 = {1, 2, 7};
        int[] nums2 = {3, 4, 5};
        findMedianSortedArrays(nums1, nums2);
    }

    /**
     * 5.5
     */
    @Test
    public void test4() {
        int[] nums1 = {6, 7};
        int[] nums2 = {1, 2, 3, 4, 5, 8, 9, 10};
        findMedianSortedArrays(nums1, nums2);
    }

    /**
     * 2.0
     */
    @Test
    public void test5() {
        int[] nums1 = {2};
        int[] nums2 = {};
        findMedianSortedArrays(nums1, nums2);
    }

    private void findMedianSortedArrays(int[] nums1, int[] nums2) {
        System.out.println(new P004_better().findMedianSortedArrays(nums1, nums2));
    }

}
