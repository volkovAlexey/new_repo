package com.my_company.task7;

public class Recursion {
    private int i = 0;

    public void printArrByRecursion(Object[] array) {
        if (i == array.length - 1) {
            System.out.print(array[i]);
            return;
        }
        System.out.print(array[i]);
        i++;
        printArrByRecursion(array);
    }
}
