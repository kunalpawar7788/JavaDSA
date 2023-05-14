package com.kunal;

import java.util.Scanner;

public class NestedSwitch {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter Day of the Week : ");
        int day = input.nextInt();

        switch (day) {
            case 1:
                System.out.println("Monday, it's WeekDay :<");
                break;
            case 2:
                System.out.println("Tuesday, it's WeekDay :<");
                break;
            case 3:
                System.out.println("Wednesday, it's WeekDay :<");
                break;
            case 4:
                System.out.println("Thursday, it's WeekDay :<");
                break;
            case 5:
                System.out.println("Friday, it's WeekDay :<");
                break;
            case 6:
                System.out.println("Saturday, it's Weekend :) !!!");
                break;
            case 7:
                System.out.println("Sunday, it's Weekend :) !!!");
                break;
            default:
                System.out.println("Enter Valid Day");
        }
    }
}
