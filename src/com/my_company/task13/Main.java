package com.my_company.task13;
//todo С помощью класса LocalDateTime посчитать сколько дней,
// часов, минут и секунд проходит между началом лекции в
// понедельник и концом лекции в четверг.

import java.time.Duration;
import java.time.LocalDateTime;

public class Main {
    public static void main(String[] args) {
        LocalDateTime fromDate = LocalDateTime.of(2021, 01, 18, 20, 00, 00);
        LocalDateTime toDate = LocalDateTime.of(2021, 01, 21, 22, 00, 00);
        System.out.println("Passed between lectures - " + getPeriod(fromDate, toDate));

    }

    private static String getPeriod(LocalDateTime fromDate, LocalDateTime toDate) {
        Duration duration = Duration.between(fromDate, toDate);
        long days = duration.toDays();
        long seconds = duration.getSeconds();
        long minutes = duration.toMinutes();
        long hours = duration.toHours();
        return "days: " + days + " seconds: " + seconds + " minutes: " + minutes + " hours: " + hours;
    }


}
