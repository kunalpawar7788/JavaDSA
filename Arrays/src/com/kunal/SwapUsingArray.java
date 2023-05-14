package com.kunal;

import java.sql.Array;
import java.util.Arrays;
import java.util.Scanner;

public class SwapUsingArray {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int arr[] = {1, 23, 42, 78, 54, 522};
        int array[] = new int[5];
        for (int i = 0; i < arr.length - 1; i++) {
            array[i] = in.nextInt();
        }
        swapInteger(array, 4 , 2);
        swapInteger(arr, 4 , 2);
        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.toString(array));
        reverseArray(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void swapInteger(int[] arr, int i, int i1) {
        arr[i] = arr[i] + arr[i1];
        arr[i1] = arr[i] - arr[i1];
        arr[i] = arr[i] - arr[i1];
    }

    static void reverseArray(int[] arr){
        int start = 0;
        int end = arr.length - 1;
        while (start < end) {
            swapInteger(arr,start,end);
            start++;
            end--;
        }
    }
}
