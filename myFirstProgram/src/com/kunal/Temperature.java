package com.kunal;

import java.util.Scanner;

public class Temperature {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter Temperature in Celsius : ");
        float degreeC = input.nextFloat();
        System.out.println("Temperature in Celsius is : " + degreeC);
        float degreeF = (degreeC * 9/5) + 32;
        System.out.println("Temperature in Fahrenheit is : " + degreeF);
    }
}
