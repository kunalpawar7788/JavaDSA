package com.kunal;

public class DuplicatesFromSortedArray {
    public static void main(String[] args) {
        int[] nums  = {0,0,1,1,1,2,2,3,3,4};
        System.out.println(removeDuplicates(nums));
    }
    public static int removeDuplicates(int[] nums) {
        if (nums.length == 0) return 0;
        int newIndex = 1;// Start from first index because first element is already in place
        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] < nums[i + 1]) { //if true, num[i + 1] is a new unique number
                nums[newIndex] = nums[i + 1];
                newIndex++;
            }
        }
        return newIndex;
    }
}
