package ru.oop;

public class DummyDic {
    String engToRus(String eng) {
        return "Неизвестное слово. " + eng;
    }

    public static void main(String[] args) {
        DummyDic d = new DummyDic();
        System.out.println(d.engToRus("cat"));
    }
}

