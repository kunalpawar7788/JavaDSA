package com.kunal;

import java.util.*;

public class TargetArray {
    public static void main(String[] args) {
        int nums[] = {0, 1, 2, 3, 4};
        int index[] = {0, 1, 2, 2, 1};
        System.out.println(Arrays.toString(createTargetArray(nums,index)));
    }
    public static int[] createTargetArray(int[] nums, int[] index){

        ArrayList<Integer> arr = new ArrayList<>();

        int[] ans = new int[nums.length];

        for (int i = 0; i < nums.length; i++)
            arr.add(index[i], nums[i]);

        for (int i = 0; i < arr.size(); i++)
            ans[i] = arr.get(i);

        return ans;
    }
}
