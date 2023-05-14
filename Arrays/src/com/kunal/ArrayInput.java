package com.kunal;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayInput {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] arr = new int[5];
        System.out.print("Enter element to add in an array : ");

        //Using For Loop
//        for (int i = 0; i < arr.length; i++) {
//            arr[i] = in.nextInt();
//            System.out.println(arr[i]);
//        }

        //Using While loop
        int i = 0;
        while (i < arr.length) {
            arr[i] = in.nextInt();
            i++;
        }
//        Print Output Using For Loop
//        for (int j = 0; j < arr.length ; j++) {
//            System.out.print(arr[j]);
//            if (j == arr.length - 1)
//                System.out.print(".");
//            else
//                System.out.print(", ");
//        }
//        System.out.print(Arrays.toString(arr));

        //Print output using for each loop
        for(int num:arr) {
            if (num == arr[i - 1])
                System.out.print(num + ".");
            else
                System.out.print(num + ", ");
        }
    }
}
