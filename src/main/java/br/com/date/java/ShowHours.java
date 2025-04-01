package br.com.date.java;

import java.time.*;
import java.time.temporal.*;

public class ShowHours implements InternalDates {

    @Override
    public void LocalDate() {
        LocalDate date = LocalDate.now();
        System.out.println(date);
    }

    @Override
    public void LocalDateTime() {
        LocalDateTime dateTime = LocalDateTime.now();
        System.out.println(dateTime);
    }

    @Override
    public void LocalDateTimeWithoutSeconds() {
        LocalDateTime dateTime = LocalDateTime.now();
        System.out.println(dateTime.truncatedTo(ChronoUnit.SECONDS));
    }

    @Override
    public void Instant() {
        Instant instant = Instant.now();
        System.out.println(instant);
    }

    @Override
    public void InstantWithoutWithoutSeconds() {
        Instant instant = Instant.now();
        System.out.println(instant.truncatedTo(ChronoUnit.SECONDS));
    }
}
