package com.kunal;

import java.util.Scanner;

public class SwapIntegers {
    public static void main(String[] args) {
        swap();
        swap2();
    }
    //swap with void return type
    static void swap(){
        Scanner input = new Scanner(System.in);
        int num1, num2 = 0;
        System.out.print("Enter first number : ");
        num1 = input.nextInt();
        System.out.print("Enter second number : ");
        num2 = input.nextInt();

        num1 = num1 + num2; // 5 + 10 = 15
        num2 = num1 - num2; // 15 - 10 = 5
        num1 = num1 - num2; // 15 - 5 = 5
        System.out.println("First number : " + num1);
        System.out.println("Second number : " + num2);
    }

    //return a value
    static int swap2(){
        Scanner input = new Scanner(System.in);
        int num1, num2 = 0;
        System.out.print("Enter first number : ");
        num1 = input.nextInt();
        System.out.print("Enter second number : ");
        num2 = input.nextInt();

        num1 = num1 + num2; // 5 + 10 = 15
        num2 = num1 - num2; // 15 - 10 = 5
        num1 = num1 - num2; // 15 - 5 = 5
        System.out.println("First number : " + num1);
        System.out.println("Second number : " + num2);
        return num1;
    }
}
