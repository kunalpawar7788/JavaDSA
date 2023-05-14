package com.kunal;

import java.util.Scanner;

public class Questions {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int num1 = in.nextInt();
        boolean ans = isPrime(num1);
        System.out.println(ans);
    }

    static boolean isPrime(int num1) {
        if (num1 <= 1) {
            System.out.println("Neither Prime nor composite");
            return false;
        }
        int i = 2;
        while (i * i <= num1) {
            if (num1 % i == 0) {
                return false;
            }
            i++;
        }
        return i * i > num1;
    }
}
