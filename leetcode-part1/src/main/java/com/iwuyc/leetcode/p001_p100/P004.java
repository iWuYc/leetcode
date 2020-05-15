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
public interface P004 {
    class Solution {
        public double findMedianSortedArrays(int[] nums1, int[] nums2) {
            int mergeLength = nums1.length + nums2.length;
            int[] locations = location(mergeLength);

            int cursorA = 0;
            int cursorB = 0;
            int currentVal;

            double sum = 0;
            int cursor = 0;
            for (int location : locations) {

                for (; cursor < mergeLength; cursor++) {
                    if (nums1.length <= cursorA) {
                        currentVal = nums2[cursorB];
                        cursorB++;

                    } else if (nums2.length <= cursorB) {
                        currentVal = nums1[cursorA];
                        cursorA++;

                    } else {
                        if (nums1[cursorA] < nums2[cursorB]) {
                            currentVal = nums1[cursorA];
                            cursorA++;
                        } else {
                            currentVal = nums2[cursorB];
                            cursorB++;
                        }
                    }
                    if (location == cursor) {
                        sum += currentVal;
                        cursor++;
                        break;
                    }
                }
            }
            return sum / locations.length;
        }

        private int[] location(int mergeLength) {
            int[] result;
            int location = mergeLength / 2;
            if (mergeLength % 2 == 0) {
                result = new int[]{location - 1, location};
            } else {
                result = new int[]{location};
            }
            return result;
        }
    }
}
