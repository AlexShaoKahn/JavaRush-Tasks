package com.javarush.task.task05.task0502;

/* 
Реализовать метод fight
*/

import java.util.Random;

public class Cat {
    public String name;
    public int age;
    public int weight;
    public int strength;

    public Cat() {
        Random random = new Random();
        age = random.nextInt(10);
        weight = random.nextInt(10);
        strength = random.nextInt(10);
    }

    public static void main(String[] args) {
        Cat cat1 = new Cat();
        Cat cat2 = new Cat();
        System.out.println(cat1.fight(cat2));
        System.out.println(cat2.fight(cat1));
    }

    public boolean fight(Cat anotherCat) {
        //напишите тут ваш код
        return anotherCat.strength + anotherCat.weight + anotherCat.strength < age + weight + strength ? true : false;
    }
}
