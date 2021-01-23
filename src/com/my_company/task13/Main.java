package com.my_company.task13;

import java.time.Duration;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class Main {
    public static void main(String[] args) {
        LocalDateTime fromDate = LocalDateTime.of(2021, 01, 18, 20, 00, 00);
        LocalDateTime toDate = LocalDateTime.of(2021, 01, 21, 22, 00, 00);
        System.out.println("Passed between lectures - " + getPeriod(fromDate, toDate));

        LocalTime start = LocalTime.of(20, 0, 0);
        LocalTime finish = LocalTime.of(22, 0, 0);
        System.out.println("Time in lecture - " + getTime(start, finish));
    }

    private static String getPeriod(LocalDateTime fromDate, LocalDateTime toDate) {
        Duration duration = Duration.between(fromDate, toDate);
        long days = duration.toDays();
        long seconds = duration.getSeconds();
        long minutes = duration.toMinutes();
        long hours = duration.toHours();
        return "days: " + days + " hours: " + hours + " minutes: " + minutes + " seconds: " + seconds;
    }

    private static String getTime(LocalTime start, LocalTime finish) {
        Duration duration = Duration.between(start, finish);
        return "minutes: " + duration.toMinutes() + " seconds: " + duration.getSeconds();
    }
}
