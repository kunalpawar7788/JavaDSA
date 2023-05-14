package com.kunal;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int result = 0;
        while (true){
            System.out.println();
            // Character operand input + - / %
            System.out.print("Enter the Operator : ");
            char op = input.next().trim().charAt(0);
            // Check for Add, Subtract, Multiply, Divide, Modulo Operation
            if (op == '+' || op == '-' || op == '*' || op == '/' || op == '%' ) {
                //Input two numbers
                System.out.print("Enter the First Number : ");
                int num1 = input.nextInt();
                System.out.print("Enter the Second Number : ");
                int num2 = input.nextInt();
                if (op == '+') {
                    result = num1 + num2;
                    System.out.println("Addition is : " + result);
                }
                if (op == '-') {
                    result = num1 - num2;
                    System.out.println("Subtraction is : " + result);
                }
                if (op == '*') {
                    result = num1 * num2;
                    System.out.println("Multiplication is : " + result);
                }
                if (op == '/') {
                    if (num2 > 0) {
                        result = num1 / num2;
                    }
                    System.out.println("Division is : " + result);
                }
                if (op == '%') {
                    result = num1 % num2;
                    System.out.println("Remainder is : " + result);
                }
            }
            else if (op == 'x' || op == 'X'){
                break;
            } else {
                System.out.println("XXXXXX Invalid Operation XXXXXX");
                break;
            }
        }

    }
}
