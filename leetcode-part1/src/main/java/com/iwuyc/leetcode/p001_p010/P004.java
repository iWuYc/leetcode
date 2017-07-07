package com.iwuyc.leetcode.p001_p010;

/**
 * 
 * 4. Median of Two Sorted Arrays
 * 
 * There are two sorted arrays nums1 and nums2 of size m and n respectively.
 * 
 * Find the median of the two sorted arrays. The overall run time complexity
 * should be O(log (m+n)).
 * 
 * Example 1:
 * 
 * nums1 = [1, 3]
 * 
 * nums2 = [2]
 * 
 * The median is 2.0
 * 
 * Example 2:
 * 
 * nums1 = [1, 2]
 * 
 * nums2 = [3, 4]
 * 
 * The median is (2 + 3)/2 = 2.5
 * 
 * @author iWuYc
 *
 */
public class P004 {
	public double findMedianSortedArrays(int[] nums1, int[] nums2) {
		int mergeLength = nums1.length + nums2.length;
		int[] locations = location(mergeLength);

		int cursorA = 0;
		int cursorB = 0;
		int currentVal = 0;

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
			result = new int[] { location - 1, location };
		} else {
			result = new int[] { location };
		}
		return result;
	}

}
