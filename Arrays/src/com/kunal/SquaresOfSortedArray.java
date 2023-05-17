package com.kunal;

import java.util.Arrays;

public class SquaresOfSortedArray {
    public static void main(String[] args) {
        int[] nums = {-7,-3,2,3,11};
        int[] ans = sortedSquares(nums);
        System.out.println(Arrays.toString(ans));
    }
    public static int[] sortedSquares(int[] nums) {
//        int[] ans = new int[nums.length];
//        for (int i = 0; i < nums.length; i++) {
//            int res = (int) Math.pow(nums[i],2);
//            ans[i] = res;
//        }
//        Arrays.sort(ans);
//        return ans;
        int length = nums.length;
        if (length == 0) return new int[0];

        int[] result = new int[length];
        int left = 0, right = length - 1;
        for (int i = length - 1; i >= 0; i--) {
            int start = nums[left] * nums[left];
            int end = nums[right] * nums[right];
            if (start > end) {
                result[i] = start;
                left++;
            } else {
                result[i] = end;
                right--;
            }
        }
        return result;
    }
}
