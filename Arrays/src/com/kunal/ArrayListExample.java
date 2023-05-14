package com.kunal;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class ArrayListExample {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        ArrayList<Integer> arrayList = new ArrayList<Integer>(10);
//        arrayList.add(12);
//        arrayList.add(45);
//        arrayList.add(21);
//        arrayList.add(44);
//        arrayList.add(65);
//        arrayList.add(75);
//        System.out.println(arrayList);
//
//        arrayList.set(5,78);
//        System.out.println(arrayList);
//
//        arrayList.remove(3);
//        System.out.println(arrayList);

        // Input of an element in array List
        for (int i = 0; i < 5; i++) {
            arrayList.add(in.nextInt());
        }
        // Get item at any index
        for (int i = 0; i < 5; i++) {
            System.out.print(arrayList.get(i) + " ");
        }
//        System.out.println(arrayList);
    }
}
