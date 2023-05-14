package com.kunal;

import java.util.Scanner;

public class if_else_conditional {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter Your Current Salary : $");
        float salary = input.nextFloat();
        if (salary > 10000 && salary < 20000) {
            salary += 2000;
            System.out.print("Bonus added in Salary, Your Current Salary is now $"+salary);
        } else if (salary > 20000) {
            salary += 3000;
            System.out.print("Bonus added in Salary, Your Current Salary is now $"+salary);
        } else {
            salary += 1000;
            System.out.print("Bonus added in Salary, Your Current Salary is now $"+salary);
        }
    }
}
