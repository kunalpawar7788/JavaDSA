package com.kunal;

import java.util.Scanner;

public class MaxNoUsingArray {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int arr[] = {1, 23, 45, 45, 78, 96, 34, 53, 2342};
        System.out.println("Max is : " + maxNo(arr));
        System.out.println("Max Number from Given range is : " + maxNoFromRange(arr, 2, 5));
    }

    private static int maxNo(int[] arr) {
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        return max;
    }

    private static int maxNoFromRange(int[] arr, int start, int end) {

        int max = arr[start];
        for (int i = 1; i < arr.length; i++) {
            if (arr[end] > max) {
                max = arr[i];
            }
        }
        return max;
    }
}
