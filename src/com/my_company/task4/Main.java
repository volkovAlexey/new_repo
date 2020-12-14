package com.my_company.task4;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Jewel jewel = new Jewel();
        int a = jewel.numJewelsInStones("qwerty", "AwdFWwe");
        System.out.println(a);

        int[] arr = {-2, 4, -1, 0};
        SortArray sortArray = new SortArray();
        int[] sqrArr = sortArray.sortSquareArray(arr);
        System.out.println(Arrays.toString(sqrArr));
    }
}
