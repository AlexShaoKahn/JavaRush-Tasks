package com.javarush.task.task03.task0309;

/* 
Сумма 10 чисел
*/

public class Solution {
    public static void main(String[] args) {
        //напишите тут ваш код
        for (int i = 1; i <= 10; i++) {
            System.out.println(s(i));
        }
    }

    public static int s(int n) {
        return n == 1 ? 1 : n + s(n - 1);
    }
}
