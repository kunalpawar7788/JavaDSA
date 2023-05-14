package com.kunal;

public class Palindrome {
    public static void main(String[] args) {
        int x = 151;
        String s = "kunal";
        boolean ans = isPalindrome(x);
        boolean ans1 = isPalindromeStr(s);
        System.out.println(ans);
        System.out.println(ans1);
    }
    public static boolean isPalindrome(int x) {
        String s = String.valueOf(x);
        int i = 0;
        int j = s.length() - 1;

        while (i <= j) {
            if (s.charAt(i) != s.charAt(j))
                return false;
            i++;
            j--;
        }
        return true;
    }
    public static boolean isPalindromeStr(String s) {
        int i = 0;
        int j = s.length() - 1;

        while (i <= j) {
            if (s.charAt(i) != s.charAt(j))
                return false;
            i++;
            j--;
        }
        return true;
    }
}
