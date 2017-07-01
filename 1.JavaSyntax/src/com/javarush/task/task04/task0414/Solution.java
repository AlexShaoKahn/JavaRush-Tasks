package com.javarush.task.task04.task0414;

/* 
Количество дней в году
*/

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        //напишите тут ваш код
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int x = (n % 4 == 0 && n % 100 != 0) || (n % 400 == 0) ? 366 : 365;
        System.out.println("количество дней в году: " + x);
    }
}