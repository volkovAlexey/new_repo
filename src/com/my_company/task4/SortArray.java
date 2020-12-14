package com.my_company.task4;

public class SortArray {

    public int[] sortSquareArray(int[] arr) {
        int[] sqrArr = squareArray(arr);
        for (int i = sqrArr.length - 1; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                if (sqrArr[j] > sqrArr[j + 1]) {
                    int tmp = sqrArr[j];
                    sqrArr[j] = sqrArr[j + 1];
                    sqrArr[j + 1] = tmp;
                }
            }
        }
        return sqrArr;
    }

    private int[] squareArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            arr[i] *= arr[i];
        }
        return arr;
    }
}
