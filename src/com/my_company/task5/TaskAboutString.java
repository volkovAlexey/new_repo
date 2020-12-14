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

    public String swapString(String s) {
        int middleIndex = s.length() / 2;
        int size = s.length();
        StringBuilder stringBuilder = new StringBuilder(s);
        if (s.length() % 2 == 0) {
            swap(stringBuilder, middleIndex, size);
        } else {
            stringBuilder.deleteCharAt(middleIndex);
            swap(stringBuilder, middleIndex, size - 1);
            stringBuilder.insert(middleIndex, s.charAt(middleIndex));
        }
        return new String(stringBuilder);
    }

    private StringBuilder swap(StringBuilder sb, int middleIndex, int size) {
        sb.insert(0, sb.substring(middleIndex, size));
        sb.setLength(size);
        return sb;
    }
}
