package com.javarush.task.task04.task0416;

/* 
Переходим дорогу вслепую
*/

import java.io.*;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        //напишите тут ваш код
        Scanner scanner = new Scanner(System.in);
        double t = scanner.nextDouble();
        double t2 = t % 5;
        if (t2 >= 4 && t2 < 5) System.out.println("красный");
        else if (t2 >= 3 && t2 < 4) System.out.println("желтый");
        else System.out.println("зелёный");
    }
}