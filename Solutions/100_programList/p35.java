// Given two integer arrays nums1 and nums2, return an array of their intersection. Each element in the result must appear as many times as it shows in both arrays and you may return the result in sorted order.

import java.util.Arrays;

public class p35 {
    public static void main(String[] args) {
        int[] nums1 = {1,2,2,1};// 1 , 1, 2, 2
        int[] nums2 = {2,2};    // 2, 2
        int[] result = intersection(nums1, nums2);
        System.out.println(Arrays.toString(result));
    }

    public static int[] intersection(int[] nums1, int[] nums2) {
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        int[] result = new int[Math.min(nums1.length, nums2.length)];
        int i = 0, j = 0, k = 0;
        while (i < nums1.length && j < nums2.length) {
            if (nums1[i] < nums2[j]) {
                i++;
            } else if (nums1[i] > nums2[j]) {
                j++;
            } else {
                result[k++] = nums1[i];
                i++;
                j++;
            }
        }
        return Arrays.copyOf(result, k);
    }
}
