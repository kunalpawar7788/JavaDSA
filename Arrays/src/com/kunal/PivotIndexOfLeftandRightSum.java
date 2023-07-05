package com.kunal;

public class PivotIndexOfLeftandRightSum {
    public static void main(String[] args) {
        int nums[] = {1,7,3,6,5,6};
        System.out.println(pivot(nums));
    }
    public static int pivot(int[] nums) {
        if (nums.length == 0) return -1;
        int leftSum = 0, rightSum = 0;
        for (int num : nums) {
            // Add all elements of nums array and store in rightSum
            rightSum += num;
        }
        for (int i = 0; i < nums.length; i++) {
            // Subtract all elements of nums array and store in left sum
            rightSum -= nums[i];
            // Match right and left sum
            if (rightSum == leftSum) return i;
            // Add leftSum to store all subtracted elements
            leftSum += nums[i];
        }
        return -1;
    }
}
