package com.kunal;

import java.util.Scanner;

public class Armstrong {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a number input : ");
        int num1 = in.nextInt();
        isArmstrong(num1);
//        for (int num1 = 100; num1 < 1000; num1++) {
//            isArmstrong(num1);
//        }
    }

    static void isArmstrong(int num1) {
        int original = num1;
        int rem = 0; int result = 0; int temp = 0;
        while (num1 > 0) {
            rem = num1 % 10;
            num1 = num1 / 10;
            temp = rem * rem * rem;
            result = temp + result;
            }
        if (original == result) {
            System.out.println(original + " is an Armstrong Number");
        }
        else {
            System.out.println(original + " is not an Armstrong Number");
        }
    }
}
