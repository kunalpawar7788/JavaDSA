package com.kunal;

import java.util.Scanner;

public class Calculator_using_methods {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        while (true) {
            System.out.print("Enter Operation to be Performed : ");
            char ch = input.next().trim().charAt(0);

            System.out.print("Enter First Number : ");
            int num1 = input.nextInt();
            System.out.print("Enter Second Number : ");
            int num2 = input.nextInt();
                switch (ch) {
                    case '+':
                        int add = add(num1, num2);
                        System.out.println("Addition of Two number is : "+ add);
                        break;
                    case '-':
                        int subtract = subtract(num1, num2);
                        System.out.println("Addition of Two number is : "+ subtract);
                        break;
                    case '*':
                        int multiply = multiply(num1, num2);
                        System.out.println("Addition of Two number is : "+ multiply);
                        break;
                    case '/':
                        int divide = divide(num1, num2);
                        System.out.println("Addition of Two number is : "+ divide);
                        break;
                    case '%':
                        int modulo = modulo(num1, num2);
                        System.out.println("Addition of Two number is : "+ modulo);
                        break;
                    default:
                        System.out.println("*---------------*");
                }
            if (ch == 'x') {
                System.out.println("----Exit----");
                break;
            }
        }
    }
    static int add(int num1, int num2) {
        int result = num1 + num2;
        return result;
    }
    static int subtract(int num1, int num2) {
        int result = num1 - num2;
        return result;
    }
    static int multiply(int num1, int num2) {
        int result = num1 * num2;
        return result;
    }
    static int divide(int num1, int num2) {
        int result = 0;
        if(num2 != 0) {
            result = num1 / num2;
        }
        return result;
    }
    static int modulo(int num1, int num2) {
        int result = num1 % num2;
        return result;
    }
}
