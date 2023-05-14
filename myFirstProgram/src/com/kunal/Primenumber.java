package com.kunal;

import java.util.Scanner;

public class Primenumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a Number : ");
        int num = input.nextInt();
        if (num <= 1){
            System.out.println("Number "+ num +" is neither prime nor composite");
            return;
        }
        int c = 2;
        if (num == 4){
            System.out.println(num + " is not a Prime Number");
        } else {
           while (c*c < num){
               if (num % c == 0){
                   System.out.println(num + " is not a Prime Number");
                   return;
               }
               c++;
           }
           if (c*c > num){
               System.out.println(num + " is a Prime Number");
           }
        }
    }
}
