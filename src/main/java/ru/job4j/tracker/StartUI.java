package ru.job4j.tracker;

import org.w3c.dom.ls.LSOutput;

import javax.crypto.spec.PSource;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class StartUI {
    //объект
    Item item = new Item();
    LocalDateTime time = item.getCreated();

    DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MMMM-EEEE-yyyy HH:mm:ss");
        String currentDateTimeFormat = time.format(formatter);

}
