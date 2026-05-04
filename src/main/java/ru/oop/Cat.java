package ru.oop;

public class Cat {

    private String food;
    private String name;

    public void show() {
        System.out.println(this.name + " съел " + this.food);
    }

    public void eat(String meat) {
        this.food = meat;
    }

    public static void main(String[] args) {
        System.out.println("There are gav's food.");
        Cat gav = new Cat();
        gav.name = "Гав";
        gav.eat("kotleta");
        gav.show();
        System.out.println("There are black's food.");
        Cat black = new Cat();
        black.name = "Блэк";
        black.eat("fish");
        black.show();
    }
}
