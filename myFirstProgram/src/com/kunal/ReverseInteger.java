package com.kunal;

public class ReverseInteger {
    public static void main(String[] args) {
        int num = 8877;
        int ans = 0;

        while (num > 0) {
            int rem = num % 10;
            num /= 10;
            ans = ans * 10 + rem;
        }
        System.out.println(ans);
    }
}

