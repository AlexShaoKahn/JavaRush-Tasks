package com.javarush.task.task04.task0427;

/* 
Описываем числа
*/

import java.io.*;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        if (x > 0 && x < 1000) {
            if (x % 2 == 0 && x / 10 < 1) System.out.println("четное однозначное число");
            else if (x % 2 != 0 && x / 10 < 1) System.out.println("нечетное однозначное число");
            else if (x % 2 == 0 && x / 100 < 0.1) System.out.println("четное двузначное число");
            else if (x % 2 != 0 && x / 100 < 0.1) System.out.println("нечетное двузначное число");
            else if (x % 2 == 0 && x / 1000 < 0.01) System.out.println("четное трехзначное число");
            else if (x % 2 != 0 && x / 1000 < 0.01) System.out.println("нечетное трехзначное число");
        }
    }
}
