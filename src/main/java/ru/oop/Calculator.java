package ru.oop;

public class Calculator {

    private static int x = 5;

    public static int sum(int y) {
        return x + y;
    }

    public static int minus(int y) {
        return y - x;
    }

    public int multiply(int a) {
        return x * a;
    }

    public int divide(int a) {
        return a / x;
    }

    public int sumAllOperation(int a) {
        return a + sum(a) + minus(a) + multiply(a) + divide(a);
    }

    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        int rsl = calculator.multiply(5);
        System.out.println(rsl);
        System.out.println(sum(5));
        System.out.println(minus(5));
        System.out.println(calculator.divide(5));
        System.out.println(calculator.sumAllOperation(5));
    }
}
