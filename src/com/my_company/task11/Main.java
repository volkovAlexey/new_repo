package com.my_company.task11;

import java.util.Random;

public class Main {

    public static void main(String[] args) {
        String s1 = "afc";
        String s2 = "vfkjnc";
        try {
            compareLastChar(s1, s2);
        } catch (IllegalArgumentException ex) {
            ex.getMessage();
        }
        int[] array = {2, 3, 0, 4, 5, 1, 7};

        try {
            System.out.println(divisionOfTwoNumbers(array, getRandomIndex(array), getRandomIndex(array)));
        } catch (ArithmeticException | IndexOutOfBoundsException ex) {
            System.out.println(ex.getMessage());
            try {
                System.out.println(divisionOfTwoNumbers(array, getRandomIndex(array), getRandomIndex(array)));
            } catch (ArithmeticException | IndexOutOfBoundsException e) {
                System.out.println(e.getMessage());
                for (int i = 0; i <= array.length; i++) {
                    if (array[i] != 0) {
                        System.out.println(divisionOfTwoNumbers(array, array[0], i));
                        break;
                    }
                }
            }
        }
    }

    private static void compareLastChar(String s1, String s2) throws IllegalArgumentException {
        Character last1 = s1.charAt(s1.length() - 1);
        Character last2 = s2.charAt(s2.length() - 1);
        if (last1.equals(last2)) {
            throw new IllegalArgumentException("The strings have the same last character - " + last1.toString());
        }
    }

    private static double divisionOfTwoNumbers(int[] array, int index1, int index2) {
        double result;
        if (array[index2] != 0) {
            result = (double) array[index1] / array[index2];
        } else {
            result = array[index1] / array[index2];
        }
        return result;
    }

    private static int getRandomIndex(int[] array) {
        Random random = new Random();
        int index = random.nextInt(array.length);
        return index;
    }
}
