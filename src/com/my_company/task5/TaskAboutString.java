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
}
