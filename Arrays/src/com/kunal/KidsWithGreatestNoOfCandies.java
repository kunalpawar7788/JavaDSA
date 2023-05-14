package com.kunal;

import java.util.ArrayList;
import java.util.List;

public class KidsWithGreatestNoOfCandies {
    public static void main(String[] args) {
        int[] candies = {3, 4, 5, 8 , 4};
        int extracandies = 3;
        System.out.println(kidsWithCandies(candies,extracandies));
    }
    public static List<Boolean> kidsWithCandies (int[] candies, int extraCandies) {
        int max = -1;
        for (int i = 0; i < candies.length; i++) {
            max = Math.max(candies[i], max);
        }
        List<Boolean> b = new ArrayList<>();
        for (int i = 0; i < candies.length; i++) {
            b.add(candies[i] + extraCandies >= max);
        }
        return b;
    }
}
