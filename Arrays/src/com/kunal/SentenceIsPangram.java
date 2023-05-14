package com.kunal;

public class SentenceIsPangram {
    public static void main(String[] args) {
        String sentence = "abcdefghijklmnopqrtuvwxyz";
        System.out.println(checkIfPangram(sentence));
    }
    public static boolean checkIfPangram(String sentence) {
        if (sentence.length() < 26) {
            return false;
        }
        for (char i = 'a'; i <= 'z'; i++) {
            if (sentence.indexOf(i) == -1) {
                return false;
            }
        }
        return true;
    }
}
