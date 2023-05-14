package com.kunal;

import java.util.Scanner;

public class largest {
    public static void main(String[] args) {

        // Another way to find out largest number with Max function
        /*
        int max = Math.max(num3,Math.max(num1,num2));
        */


        Scanner input = new Scanner(System.in);
        int num1 = input.nextInt();
        int num2 = input.nextInt();
        int num3 = input.nextInt();

        int max = num1;
        if (num2 > max) {
            max = num2;
        }
        if (num3 > max) {
            max = num3;
        }
        System.out.println("Largest Number is " + max);
    }
}
