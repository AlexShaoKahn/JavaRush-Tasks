package com.javarush.task.task01.task0132;

/* 
Сумма цифр трехзначного числа
*/

public class Solution {
    public static void main(String[] args) {
        System.out.println(sumDigitsInNumber(546));
    }

    public static int sumDigitsInNumber(int number) {
        //напишите тут ваш код
        int summ = 0;
        int num;
        for (num = number; num != 0; num /= 10) {
            summ += num % 10;
        }
        return summ;
    }
}