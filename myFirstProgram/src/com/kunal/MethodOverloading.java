package com.kunal;

public class MethodOverloading {
    public static void main(String[] args) {
        fun(78);
        fun("Kunal");
    }

    // Same method/function name with different arguments
    static void fun(int a) {
        System.out.println(a);
    }
    static void fun(String name) {
        System.out.println(name);
    }
}
