package com.kunal;

import java.util.Scanner;

public class casecheck {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a Character : ");
        char ch = input.next().trim().charAt(0);
        System.out.println("Entered Character is " + ch);

        if (ch >= 'a' && ch <= 'z'){
            System.out.print("Character "+ ch +" is in lowercase ");
        }
        else {
            System.out.print("Character "+ ch +" is in Uppercase ");
        }
    }
}
