package com.kunal;

public class Fibonacci {
    public static void main(String[] args) {
        int n = 1;
        System.out.println(fibo(n));
    }
    public static int fibo(int n) {
        int first = 0;
        int second = 1;
        int result = 0;
        if (n < 2) return n;
        for (int i = 2; i <= n; i++) {
            result = first + second;
            first = second;
            second = result;
        }
        return result;
    }
}
