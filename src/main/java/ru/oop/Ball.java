package ru.oop;

public class Ball {
    public void tryRun(boolean condition) {
        if (condition) {
            System.out.println("Ball was eaten");
        } else {
            System.out.println("Ball was not eaten");
        }
    }
}
