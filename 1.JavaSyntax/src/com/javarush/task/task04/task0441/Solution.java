package com.javarush.task.task04.task0441;


/* 
Как-то средненько
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

        if (a >= c && b < c) {
            System.out.println(c);
        } else if (a <= c && b > c) {
            System.out.println(c);
        } else if (a <= b && c < a) {
            System.out.println(a);
        } else if (a >= b && b > c) {
            System.out.println(b);
        } else if (a <= b && b < c) {
            System.out.println(b);
        } else if (a >= b && a < c) {
            System.out.println(a);
        } else if (b >= c && a < c) {
            System.out.println(c);
        } else if (b >= c && a > b) {
            System.out.println(b);
        } else if (a == b && b == c) {
            System.out.println(a | b | c);
        }
    }
}
