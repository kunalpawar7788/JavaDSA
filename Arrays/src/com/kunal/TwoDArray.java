package com.kunal;

import java.util.Arrays;
import java.util.Scanner;

public class TwoDArray {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int arr[][] = new int [3][3];
//        int arr [][] = {
//                {1, 2, 3},
//                {4, 5, 6},
//                {7, 8, 9}
//        };
//        for (int i = 0; i < arr.length; i++) {
//            System.out.println(Arrays.toString(arr[i]));
//        }
        System.out.println("Array Length is : " + arr.length);
//        for (int row = 0; row < arr.length; row++) {
//            for (int col = 0; col < arr[row].length; col++) {
//                arr[row][col] = in.nextInt();
//                System.out.print(arr[row][col] + " ");
//            }
//            System.out.println();
//        }

        // Enhanced For loop using For Each loop
        for (int[] a: arr) {
            System.out.println(Arrays.toString(a));
        }
    }
}
