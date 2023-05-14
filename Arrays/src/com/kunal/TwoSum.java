package com.kunal;

import java.util.Arrays;

public class TwoSum {
    public static void main(String[] args) {
        int nums[] = {6, 1, 3, 15};
        int target = 9;
        int[] ans = twoSum(nums,target);
        System.out.println(Arrays.toString(ans));
    }
    public static int[] twoSum(int[] nums, int target) {
        for(int i = 0; i < nums.length - 1; i++){
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target)
                    return new int[] {i,j};
            }
        }
        return new int[]{};
    }
}
