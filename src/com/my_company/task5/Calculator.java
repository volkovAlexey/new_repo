package com.my_company.task5;

public class Calculator {

    public int plus(int a, int b) {
        return a + b;
    }

    public int plus(int[] arr) {
        int sum = 0;
        for (int temp : arr) {
            sum += temp;
        }
        return sum;
    }

    public double multiply(double a, double b) {
        return a * b;
    }
}