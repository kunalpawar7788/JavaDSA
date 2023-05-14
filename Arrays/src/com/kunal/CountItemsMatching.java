package com.kunal;

import java.util.*;

public class CountItemsMatching {
    public static void main(String[] args) {

    }

    public int countMatches(List<List<String>> items, String ruleKey, String ruleValue) {
        //We take an int variable to store the index of the rulekey value
        int rk = -1;
        if (ruleKey.equals("type"))
            rk = 0;
        else if (ruleKey.equals("color"))
            rk = 1;
        else
            rk = 2;

        //Count variable is used to store the count of matching variables
        int count = 0;
        int len = items.size();

        //We iterate over the list to count number of matching variables
        for (int i = 0; i < len; i++) {
            if (items.get(i).get(rk).equals(ruleValue))
                count++;
        }

        return count;
    }
}

