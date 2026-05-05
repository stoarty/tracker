package ru.oop;

public class Ball {
    void tryRun(boolean condition) {
        if (condition) {
            System.out.println("Ball was eaten");
        } else {
            System.out.println("Ball was not eaten");
        }
    }
}
