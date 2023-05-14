package com.kunal;

public class JumpGame {
    public static void main(String[] args) {
        int[] nums = {1};
        System.out.println(canJump(nums));
    }
    public static boolean canJump(int[] nums) {
        int boundary = 0;
        for(int i =0;i<=boundary;i++){
            boundary = Math.max(boundary,i+nums[i]);
            if(boundary >=nums.length-1)
                return true;
        }
        return false;
    }
}
