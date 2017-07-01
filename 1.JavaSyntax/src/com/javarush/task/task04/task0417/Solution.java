package com.javarush.task.task04.task0417;

/* 
Существует ли пара?
*/

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        //напишите тут ваш код
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        if (a == b) {
            System.out.print(a + " " + b);
            if (a == c) System.out.println(" " + c);
        } else if (a == c) System.out.println(a + " " + c);
        else if (b == c) System.out.println(b + " " + c);
    }
}