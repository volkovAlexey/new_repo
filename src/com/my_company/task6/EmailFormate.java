package com.my_company.task6;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class EmailFormate {

    private Pattern pattern;
    private Matcher matcher;

    private static final String EMAIL_PATTERN =
            "^[_A-Za-z0-9-\\+]+(\\.[_A-Za-z0-9-]+)*@" +
                    "[A-Za-z0-9-]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$";

    public EmailFormate() {
        pattern = Pattern.compile(EMAIL_PATTERN);
    }

    public String findDomain(String email) {
        matcher = pattern.matcher(email);
        if (matcher.matches()) {
            String s = email.split("@")[1];
            return s;
        }
        return "Wrong email format";
    }
}
