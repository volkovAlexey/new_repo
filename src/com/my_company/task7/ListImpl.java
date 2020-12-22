package com.my_company.task7;

import java.util.Arrays;

public class ListImpl implements IntStack, IntList {
    private int[] intArray = new int[10];
    private int top = -1;

    @Override
    public void add(int i) {

    }

    @Override
    public void insert(int index, int value) {

    }

    @Override
    public void set(int index, int value) {

    }

    @Override
    public int size() {
        return 0;
    }

    @Override
    public int capacity() {
        return 0;
    }

    @Override
    public int getByIndex(int index) {
        return intArray[index];
    }

    @Override
    public Integer getIndexByValue(int value) {
        return null;
    }

    @Override
    public boolean contains(int value) {
        return false;
    }

    @Override
    public void removeValue(int value) {

    }

    @Override
    public void removeByIndex(int index) {

    }

    @Override
    public IntList subList(int fromIndex, int toIndex) {
        return null;
    }

    @Override
    public int[] toArray() {
        return new int[0];
    }

    @Override
    public void push(int value) {
        if (top < 0) {
            intArray[++top] = value;
            top++;
        }
        if (top >= intArray.length - 1) {
            int newLength = (intArray.length * 3 / 2) + 1;
            intArray = Arrays.copyOf(intArray, newLength);
        } else {
            intArray[top] = value;
            top++;
        }
    }

    @Override
    public int pop() {
        int value = intArray[top - 1];
        top--;
        return value;
    }

    @Override
    public int peek() {
        return getByIndex(top - 1);
    }
}
