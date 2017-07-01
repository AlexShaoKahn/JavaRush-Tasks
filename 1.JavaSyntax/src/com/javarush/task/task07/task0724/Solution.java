package com.javarush.task.task07.task0724;

/* 
Семейная перепись
*/

public class Solution {
    public static void main(String[] args) {
        //напишите тут ваш код
        Human grandfather01 = new Human("grandfather01", true, 80);
        Human grandmother01 = new Human("grandmother01", false, 75);
        Human grandfather02 = new Human("grandfather02", true, 90);
        Human grandmother02 = new Human("grandmother02", false, 85);
        Human father = new Human("father", true, 40, grandfather01, grandmother01);
        Human mother = new Human("mother", false, 35, grandfather02, grandmother02);
        Human child01 = new Human("child01", true, 10, father, mother);
        Human child02 = new Human("child02", false, 15, father, mother);
        Human child03 = new Human("child03", true, 20, father, mother);

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
        private Human father;
        private Human mother;

        public Human(String name, boolean sex, int age) {
            this.name = name;
            this.sex = sex;
            this.age = age;
        }

        public Human(String name, boolean sex, int age, Human father, Human mother) {
            this.name = name;
            this.sex = sex;
            this.age = age;
            this.father = father;
            this.mother = mother;
        }

        public String toString() {
            String text = "";
            text += "Имя: " + this.name;
            text += ", пол: " + (this.sex ? "мужской" : "женский");
            text += ", возраст: " + this.age;

            if (this.father != null)
                text += ", отец: " + this.father.name;

            if (this.mother != null)
                text += ", мать: " + this.mother.name;

            return text;
        }
    }
}






















