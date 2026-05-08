package ru.tracker;

import java.time.format.DateTimeFormatter;

public class StartUI {
    public static void main(String[] args) {
        var item = new Item();
        var formatter = DateTimeFormatter.ofPattern("dd-MMMM-EEEE-yyyy HH:mm:ss");
        var created = item.getCreated();
        System.out.println(created.format(formatter));
    }
}
