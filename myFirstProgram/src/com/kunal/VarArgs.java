package com.kunal;

import java.util.Arrays;

public class VarArgs {
    public static void main(String[] args) {
        // args passed
    fun(2,3,4,5,6,7,8);
    multiple(7,8,"Kunal","Pawar");
    }

    static void multiple(int a, int b, String ...v) {
        System.out.println(a + " " + b + " " + Arrays.toString(v));
    }

    //we can provide n number of args with integer type as shown below which will convert into array internally
    static void fun(int ...v) {
        System.out.println(Arrays.toString(v));
    }

}
