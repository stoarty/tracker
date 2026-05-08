package ru.tracker;

import java.util.Arrays;

public class Tracker {
    private final Item[] items = new Item[100];
    private int ids = 1;
    private int size = 0;

    public Item add(Item item) {
        item.setId(ids++);
        items[size++] = item;
        return item;
    }

    public Item findById(int id) {
        for (int i = 0; i < size; i++) {
            if (items[i].getId() == id) {
                return items[i];
            }
        }
        return null;
    }

    public Item[] findAll() {
        Item[] rsl = new Item[size];
        System.arraycopy(items, 0, rsl, 0, size);
        return rsl;
    }

    public Item[] findByName(String key) {
        Item[] temp = new Item[size];
        int count = 0;
        for (int i = 0; i < size; i++) {
            if (items[i].getName().equals(key)) {
                temp[count++] = items[i];
            }
        }
        return Arrays.copyOf(temp, count);
    }
}