package com.kunal;

public class AddDigits {
    public static void main(String[] args) {
        int num = 34;
        System.out.println(addDigits(num));
    }

    static int addDigits(int num) {
        for (int rem = 0; rem < num; rem++) {
            rem = num % 10;
            int rem2 = rem % 10;
            int sum = rem + rem2;
            return sum;
        }
        return -1;
    }
}
