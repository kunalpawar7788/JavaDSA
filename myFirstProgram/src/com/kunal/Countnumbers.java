package com.kunal;

public class Countnumbers {
    public static void main(String[] args) {
        int num = 2420025;
        int count = 0;

        while (num > 0){
            int rem = num % 10;
            if (rem == 2) {
                count++;
            }
         num = num / 10;
        }
        System.out.println("Number of 2's in given integer is " + count);
    }
}
