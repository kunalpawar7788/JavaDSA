package com.kunal;

import java.util.Scanner;
// Factorial of a number 5 is 5*4*3*2*1 = 120
public class Factorial {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number to find out the factorial : ");
        // Store Integer input in variable
        int num = input.nextInt();
        // Result as 1 to multiply with input variable [0 will be undefined]
        int result = 1;
        for (int i = 1; i <= num ; i++) {
            result = result * i;
        }
        System.out.println("Factorial of Number " + num + " is '" + result + "'");
    }
}
