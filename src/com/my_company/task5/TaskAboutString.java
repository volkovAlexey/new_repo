package com.my_company.task5;

public class TaskAboutString {

    public String findMiddleInString(String s) {
        String s1;
        int beginIndex = s.length() / 2;
        int endIndex = beginIndex + 2;
        if (s.length() % 2 == 0) {
            s1 = s.substring(beginIndex, endIndex);
        } else {
            s1 = String.valueOf(s.charAt(beginIndex));
        }
        return s1;
    }

    public String invertCase(String s) {
        char[] chars = s.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            char c = chars[i];
            if (Character.isLowerCase(c)) {
                chars[i] = Character.toUpperCase(c);
            } else {
                chars[i] = Character.toLowerCase(c);
            }
        }
        return new String(chars);
    }
}
