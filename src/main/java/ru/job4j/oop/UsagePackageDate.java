package ru.job4j.oop;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.SortedMap;

public class UsagePackageDate {
    public static void main(String[] args) {
        //объявили объект
        LocalDate currenrDate = LocalDate.now();
        System.out.println("Текущая дата " + currenrDate);

        LocalTime currentTime = LocalTime.now();
        System.out.println("Текущее время " + currentTime);

        LocalDateTime currentDateTime = LocalDateTime.now();
        System.out.println("Текущие дата и время до форматирования " + currentDateTime);

        //метод, убираем Т и наносекунды используя статистический метод ofPattern() класса DateTimeFormatter:

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss"); // образец
        String currentDateTimeFormat = currentDateTime.format(formatter);
        System.out.println("Текущие дата и время отформатированы " + currentDateTimeFormat);

    }
}
