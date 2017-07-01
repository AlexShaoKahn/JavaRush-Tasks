package com.javarush.task.task08.task0827;

import java.util.Date;

/* 
Работа с датой
*/

public class Solution {
    public static void main(String[] args) {
        System.out.println("JANUARY 1 2000 = " + isDateOdd("JANUARY 1 2000"));
        System.out.println("JANUARY 2 2020 = " + isDateOdd("JANUARY 2 2020"));
    }

    public static boolean isDateOdd(String date) {
        Date dt1 = new Date(date);
        Date dt2 = new Date(date);
        dt1.setMonth(0);
        dt1.setDate(1);
        long a = (dt2.getTime() - dt1.getTime()) / (3600 * 24 * 1000) + 1;
        if (a % 2 != 0)
            return true;
        return false;
    }
}
