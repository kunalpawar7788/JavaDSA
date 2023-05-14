package com.kunal;

import java.util.Arrays;

public class RunningSumOfArray {
    public static void main(String[] args) {
        int[] nums = {1, 1, 1, 1, 1};
        int[] ans = runningSum(nums);
        System.out.println(Arrays.toString(ans));
    }
    public static int[] runningSum(int[] nums) {
        int[] ans = new int[nums.length];
        int result = ans[0];
        for (int i = 0; i < nums.length; i++) {
            result = nums[i] + result;
            ans[i] = result;
        }
    return ans;
    }
}
