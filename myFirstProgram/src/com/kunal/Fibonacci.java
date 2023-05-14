package com.kunal;

import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter nth Value : ");
        int num = input.nextInt();
        int a = 0;
        int b = 1;
        int count = 2;

        while(count <= num) {
            int temp = b;
            b = b + a;
            a = temp;
            count++;
        }
        System.out.println("Fibonacci value of "+ num +" is "+ b +" !!!");
    }
}
