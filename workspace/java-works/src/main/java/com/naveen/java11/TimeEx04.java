package com.naveen.java11;

import java.time.Clock;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.ZoneId;
import java.time.temporal.ChronoUnit;
import java.util.Calendar;

public class TimeEx04 {
    public static void main(String[] args) {
        Calendar cal = Calendar.getInstance();

        System.out.println("Calendar Time " + cal.getTime());
        cal.add(Calendar.HOUR, 10);

        System.out.println("After adding 10 hrs " + cal.getTime());

        LocalTime now = LocalTime.now();

        System.out.println(now);
        LocalTime now1 = now.plus(8, ChronoUnit.HOURS);
        System.out.println(now1);

        // adding 30 Days

        LocalDate today = LocalDate.now();
        System.out.println(today);
        System.out.println(today.plusDays(30));
        System.out.println(today.getMonth());


        System.out.println(Clock.systemDefaultZone());

        // list all the timezones
        System.out.println("----------------------------");


        ZoneId.getAvailableZoneIds().forEach(System.out :: println);

        System.out.println("In India " + now);

        ZoneId cstTimeZone = ZoneId.of("America/Chicago");
        LocalTime localTimeOfCST = LocalTime.now(cstTimeZone);
        System.out.println("Chicago Time is " + localTimeOfCST);


        var pacificTimeZone = "US/Pacific";
        ZoneId pstTimeZone = ZoneId.of(pacificTimeZone);
        LocalTime localTimeOfPST = LocalTime.now(pstTimeZone);
        System.out.println("California Time is " + localTimeOfPST);

    }
}
