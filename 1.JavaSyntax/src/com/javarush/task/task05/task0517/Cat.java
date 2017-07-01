package com.javarush.task.task05.task0517;

/* 
Конструируем котиков
*/

public class Cat {
    //напишите тут ваш код
    private String name;
    private int age;
    private int weight;
    private String address;
    private String color;

    public Cat(String name) {
        this.name = name;
        this.age = 5;
        this.weight = 5;
        this.color = "Red";
        this.address = null;
    }

    public Cat(String name, int weight, int age) {
        this.name = name;
        this.age = age;
        this.weight = weight;
        this.color = "Red";
        this.address = null;
    }

    public Cat(String name, int age) {
        this.name = name;
        this.age = age;
        this.weight = 5;
        this.color = "Blue";
        this.address = null;
    }

    public Cat(int weight, String color) {
        this.weight = weight;
        this.color = color;
        this.age = 5;
        this.name = null;
        this.address = null;
    }

    public Cat(int weight, String color, String address) {
        this.weight = weight;
        this.address = address;
        this.color = color;
        this.age = 5;
        this.name = null;
    }

    public static void main(String[] args) {

    }
}
