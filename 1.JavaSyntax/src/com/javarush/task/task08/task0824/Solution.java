package com.javarush.task.task08.task0824;

/* 
Собираем семейство
*/

import java.util.ArrayList;
import java.util.Arrays;

public class Solution {
    public static void main(String[] args) {
        //напишите тут ваш код
        Human child01 = new Human("child01", true, 20);
        Human child02 = new Human("child02", false, 15);
        Human child03 = new Human("child03", true, 10);
        Human father = new Human("father", true, 40, new ArrayList<Human>(Arrays.asList(child01, child02, child03)));
        Human mother = new Human("mother", false, 35, new ArrayList<Human>(Arrays.asList(child01, child02, child03)));
        Human grandfather01 = new Human("grandfather01", true, 90, new ArrayList<Human>(Arrays.asList(father)));
        Human grandfather02 = new Human("grandfather02", false, 85, new ArrayList<Human>(Arrays.asList(mother)));
        Human grandmother01 = new Human("grandmother01", true, 80, new ArrayList<Human>(Arrays.asList(father)));
        Human grandmother02 = new Human("grandmother02", false, 75, new ArrayList<Human>(Arrays.asList(mother)));

        System.out.println(grandfather01);
        System.out.println(grandmother01);
        System.out.println(grandfather02);
        System.out.println(grandmother02);
        System.out.println(father);
        System.out.println(mother);
        System.out.println(child01);
        System.out.println(child02);
        System.out.println(child03);
    }

    public static class Human {
        //напишите тут ваш код
        private String name;
        private boolean sex;
        private int age;
        private ArrayList<Human> children;

        public Human(String name, boolean sex, int age) {
            this.name = name;
            this.sex = sex;
            this.age = age;
        }

        public Human(String name, boolean sex, int age, ArrayList<Human> children) {
            this.name = name;
            this.sex = sex;
            this.age = age;
            this.children = children;
        }

        public String toString() {
            String text = "";
            text += "Имя: " + this.name;
            text += ", пол: " + (this.sex ? "мужской" : "женский");
            text += ", возраст: " + this.age;

            if (children != null) {
                int childCount = this.children.size();
                if (childCount > 0) {
                    text += ", дети: " + this.children.get(0).name;

                    for (int i = 1; i < childCount; i++) {
                        Human child = this.children.get(i);
                        text += ", " + child.name;
                    }
                }
            }
            return text;
        }
    }

}
