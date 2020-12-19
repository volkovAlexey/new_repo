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
        if (matcher.matches()) {
            matcher.reset();
            if (matcher.find()) {
                String day = matcher.group(1);
                String month = matcher.group(2);
                int year = Integer.parseInt(matcher.group(3));
                if (day.equals("31") &&
                        (month.equals("4") || month.equals("6") || month.equals("9") ||
                                month.equals("11") || month.equals("04") || month.equals("06") ||
                                month.equals("09"))) {
                    return false;
                } else if (month.equals("2") || month.equals("02")) {
                    if (year % 4 == 0) {
                        if (day.equals("30") || day.equals("31")) {
                            return false;
                        } else {
                            return true;
                        }
                    } else {
                        if (day.equals("29") || day.equals("30") || day.equals("31")) {
                            return false;
                        } else {
                            return true;
                        }
                    }
                } else {
                    return true;
                }
            } else {
                return false;
            }
        } else {
            return false;
        }
    }
}
