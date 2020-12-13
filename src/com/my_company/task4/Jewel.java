package com.my_company.task4;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Jewel {

    public int numJewelsInStones(String jewels, String stones) {
        int numJewels = 0;
        String regex = "[A-Za-z]";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcherJewels = pattern.matcher(jewels);
        Matcher matcherStones = pattern.matcher(stones);
        if (matcherJewels.find() && matcherStones.find()) {
            char[] charsJewels = jewels.toCharArray();
            char[] charsStones = stones.toCharArray();
            for (char charJewel : charsJewels) {
                for (char charStone : charsStones) {
                    if (charJewel == charStone) {
                        numJewels++;
                    }
                }
            }
        }
        return numJewels;
    }
}
