package com.javarush.task.task03.task0308;

/* 
Произведение 10 чисел
*/

public class Solution {
    public static void main(String[] args) {
        //напишите тут ваш код
        System.out.println(f(10));
    }

    public static int f(int n) {
        return n == 1 ? 1 : n * f(n - 1);
    }
}
