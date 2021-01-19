package com.my_company.task11;

public class Main {

    public static void main(String[] args) {
        String s1 = "afc";
        String s2 = "vfkjnc";
        try {
            compareLastChar(s1, s2);
        } catch (IllegalArgumentException ex) {
            ex.getMessage();
        }
    }

    private static void compareLastChar(String s1, String s2) throws IllegalArgumentException {
        Character last1 = s1.charAt(s1.length() - 1);
        Character last2 = s2.charAt(s2.length() - 1);
        if (last1.equals(last2)) {
            throw new IllegalArgumentException("The strings have the same last character - " + last1.toString());
        }
    }
}
