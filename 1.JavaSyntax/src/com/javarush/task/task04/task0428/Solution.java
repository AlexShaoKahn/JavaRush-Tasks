package com.javarush.task.task04.task0428;

/* 
Положительное число
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
        i += a > 0 ? 1 : 0;
        i += b > 0 ? 1 : 0;
        i += c > 0 ? 1 : 0;
        if (i != 0) System.out.println(i);
        else System.out.println(0);
    }
}
