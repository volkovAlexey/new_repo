package com.my_company.task13;

import java.time.*;

public class CalculateTime {

    public String getPeriod(LocalDateTime fromDate, LocalDateTime toDate) {
        Duration duration = Duration.between(fromDate, toDate);
        long days = duration.toDays();
        long seconds = duration.getSeconds();
        long minutes = duration.toMinutes();
        long hours = duration.toHours();
        return "days: " + days + " hours: " + hours + " minutes: " + minutes + " seconds: " + seconds;
    }

    public String getTime(LocalTime start, LocalTime finish) {
        Duration duration = Duration.between(start, finish);
        return "minutes: " + duration.toMinutes() + " seconds: " + duration.getSeconds();
    }

    public Long calculateMinutesInSeason(String seasonName) {
        Month startMonth;
        Month endMonth;
        if (seasonName.equalsIgnoreCase("Spring")) {
            startMonth = Month.MARCH;
            endMonth = Month.MAY;
            return minutesInSeason(startMonth, endMonth);
        }
        if (seasonName.equalsIgnoreCase("Summer")) {
            startMonth = Month.JUNE;
            endMonth = Month.AUGUST;
            return minutesInSeason(startMonth, endMonth);
        }
        if (seasonName.equalsIgnoreCase("Autumn")) {
            startMonth = Month.SEPTEMBER;
            endMonth = Month.NOVEMBER;
            return minutesInSeason(startMonth, endMonth);
        }
        if (seasonName.equalsIgnoreCase("Winter")) {
            startMonth = Month.DECEMBER;
            endMonth = Month.FEBRUARY;
            return minutesInSeason(startMonth, endMonth);
        }
        throw new IllegalArgumentException("Wrong name of season!");
    }

    private Long minutesInSeason(Month startMonth, Month endMonth) {
        LocalDateTime startDate;
        LocalDateTime endDate;
        startDate = LocalDateTime.of(LocalDate.now().getYear(), Month.MARCH, 1, 0, 0, 0);
        endDate = LocalDateTime.of(LocalDate.now().getYear(), Month.MAY, Month.MAY.maxLength(), 23, 59, 59);
        return Duration.between(startDate, endDate).toMinutes();
    }
}
