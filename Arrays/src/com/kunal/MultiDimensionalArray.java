package com.kunal;

public class MultiDimensionalArray {
    public static void main(String[] args) {
        /*
            1 2 3
            4 5
            6 7 8 9
         */
        int[][] arr2D = {
                {1,2,3},
                {4,5},
                {6,7,8,9}
        };
        System.out.println(arr2D[1][1]);

        int[][][] arr3D = {
                {
                    {1,2,3}, {4,5}
                },
                {
                    {6, 7, 8, 9}, {10, 11, 12}
                }
        };
                System.out.println(arr3D[1][0][2]);
    }
}
