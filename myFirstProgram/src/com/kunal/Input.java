package com.kunal;

import java.util.Scanner;

public class Input {
    public static void main(String[] args) {
        System.out.print("Enter your Roll No : ");
        Scanner inputInteger = new Scanner(System.in);
        int num = inputInteger.nextInt();
        System.out.println("Your Roll No is " + num + "\t!!!!!");
    }
}
