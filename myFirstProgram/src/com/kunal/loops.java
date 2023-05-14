package com.kunal;

import java.util.Scanner;

public class loops {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter row count : ");
        int row = input.nextInt();
        System.out.print("Enter col count : ");
        int col = input.nextInt();
        for (int i = 1; i <= row ; i++) {
            System.out.println(" *");
            for (int j = 1; j <= col; j++) {
                System.out.print(" *");
            }
        }
    }
}
