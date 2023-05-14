package com.kunal;

import java.util.ArrayList;
import java.util.Scanner;

public class MultiArrayList {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        ArrayList<ArrayList<Integer>> arrMultiList = new ArrayList<>();

        // Initialisation of Array List inside Array List
        for (int i = 0; i < 3; i++) {
            arrMultiList.add(new ArrayList<>());
        }
        System.out.println(arrMultiList);
        // Add elements in Array List
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                arrMultiList.get(i).add(in.nextInt());
            }
        }
        System.out.println(arrMultiList);
    }
}
