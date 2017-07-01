package com.javarush.task.task04.task0442;


/* 
Суммирование
*/

import java.io.*;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        Scanner scanner = new Scanner(System.in);
        int x = 0;
        int summ = 0;
        while (x != -1) {
            x = scanner.nextInt();
            summ += x;

        }
        System.out.println(summ);
    }
}
