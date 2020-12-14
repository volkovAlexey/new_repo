package com.my_company.task5;

public class Calculator {

    public int plus(int[] arr) {
        int sum = 0;
        for (int temp : arr) {
            sum = sum + temp;
        }
        return sum;
    }
}
