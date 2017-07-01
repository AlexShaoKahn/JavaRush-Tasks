package com.javarush.task.task04.task0429;

/* 
Положительные и отрицательные числа
*/

import java.io.*;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        int i = 0;
        int j = 0;
        if (a < 0) i++;
        else if (a > 0) j++;
        if (b < 0) i++;
        else if (b > 0) j++;
        if (c < 0) i++;
        else if (c > 0) j++;
        System.out.println("количество отрицательных чисел: " + i);
        System.out.println("количество положительных чисел: " + j);
    }
}
