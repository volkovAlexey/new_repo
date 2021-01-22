package com.my_company.task6;


import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class DateFormat {
    private Pattern pattern;
    private Matcher matcher;

    private static final String DATE__PATTERN =
            "(0?[1-9]|[12][0-9]|3[01])/(0?[1-9]|1[012])/((19|20)\\d\\d)\\s" +
                    "(?:0[0-9]|1[0-9]|2[0-3]):(?:[0-5][0-9])";

    public DateFormat() {
        pattern = Pattern.compile(DATE__PATTERN);
    }

    public boolean validate(final String date) {
        matcher = pattern.matcher(date);
        return matcher.matches();
    }
}
