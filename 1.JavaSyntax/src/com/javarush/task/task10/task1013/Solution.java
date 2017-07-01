package com.javarush.task.task10.task1013;

/* 
Конструкторы класса Human
*/

public class Solution {
    public static void main(String[] args) {
    }

    public static class Human {
        // напишите тут ваши переменные и конструкторы
        private int field01;
        private char field02;
        private boolean field03;
        private short field04;
        private long field05;
        private double field06;

        public Human() {
            field01 = 0;
            field02 = 0;
            field03 = false;
            field04 = 0;
            field05 = 0;
            field06 = 0;
        }

        public Human(int field01, char field02, boolean field03, short field04, long field05, double field06) {
            this.field01 = field01;
            this.field02 = field02;
            this.field03 = field03;
            this.field04 = field04;
            this.field05 = field05;
            this.field06 = field06;
        }

        public Human(int field01) {
            this.field01 = field01;
        }

        public Human(char field02) {
            this.field02 = field02;
        }

        public Human(boolean field03) {
            this.field03 = field03;
        }

        public Human(short field04) {
            this.field04 = field04;
        }

        public Human(long field05) {
            this.field05 = field05;
        }

        public Human(double field06) {
            this.field06 = field06;
        }

        public Human(int field01, char field02, boolean field03) {
            this.field01 = field01;
            this.field02 = field02;
            this.field03 = field03;
        }

        public Human(short field04, long field05, double field06) {
            this.field04 = field04;
            this.field05 = field05;
            this.field06 = field06;
        }
    }
}
