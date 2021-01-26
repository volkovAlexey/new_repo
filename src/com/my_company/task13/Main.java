package com.my_company.task13;

import java.time.*;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

public class Main {

    public static void main(String[] args) {
        CalculateTime time = new CalculateTime();
        LocalDateTime fromDate = LocalDateTime.of(2021, 01, 18, 20, 00, 00);
        LocalDateTime toDate = LocalDateTime.of(2021, 01, 21, 22, 00, 00);
        System.out.println("Passed between lectures - " + time.getPeriod(fromDate, toDate));

        LocalTime start = LocalTime.of(20, 0, 0);
        LocalTime finish = LocalTime.of(22, 0, 0);
        System.out.println("Time in lecture - " + time.getTime(start, finish));

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy/MMM/dd HH:mm:ss", Locale.UK);
        DateTimeFormatter formatter1 = DateTimeFormatter.ofPattern("HH:mm yyyy/MM/dd", Locale.UK);

        LocalDateTime date = LocalDateTime.parse("1993/Jun/22 07:34:56", formatter);
        System.out.println(date);
        LocalDateTime date1 = LocalDateTime.parse("22:10 1993/12/25", formatter1);
        System.out.println(date1);

        Long minutes = time.calculateMinutesInSeason("Summer");
        System.out.println(minutes);
    }
}