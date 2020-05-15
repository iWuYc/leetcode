package com.iwuyc.leetcode.p001_p100;

/**
 * 4. Median of Two Sorted Arrays
 * <p>
 * There are two sorted arrays nums1 and nums2 of size m and n respectively.
 * <p>
 * Find the median of the two sorted arrays. The overall run time complexity
 * should be O(log (m+n)).
 * <p>
 * Example 1:
 * <p>
 * nums1 = [1, 3]
 * <p>
 * nums2 = [2]
 * <p>
 * The median is 2.0
 * <p>
 * Example 2:
 * <p>
 * nums1 = [1, 2]
 * <p>
 * nums2 = [3, 4]
 * <p>
 * The median is (2 + 3)/2 = 2.5
 *
 * @author iWuYc
 */
public interface P004_better {
    class Solution {
        public int findKth(int[] A, int A_start, int[] B, int B_start, int k) {
            if (A_start >= A.length) {
                return B[B_start + k - 1];
            }
            if (B_start >= B.length) {
                return A[A_start + k - 1];
            }

            if (k == 1) {
                return Math.min(A[A_start], B[B_start]);
            }

            int A_key = A_start + k / 2 - 1 < A.length ? A[A_start + k / 2 - 1] : Integer.MAX_VALUE;
            int B_key = B_start + k / 2 - 1 < B.length ? B[B_start + k / 2 - 1] : Integer.MAX_VALUE;

            if (A_key < B_key) {
                return findKth(A, A_start + k / 2, B, B_start, k - k / 2);
            } else {
                return findKth(A, A_start, B, B_start + k / 2, k - k / 2);
            }
        }

        public double findMedianSortedArrays(int[] nums1, int[] nums2) {
            int len = nums1.length + nums2.length;
            if (len % 2 == 1) {
                return findKth(nums1, 0, nums2, 0, len / 2 + 1);
            }
            return (findKth(nums1, 0, nums2, 0, len / 2) + findKth(nums1, 0, nums2, 0, len / 2 + 1)) / 2.0;
        }
    }
}
