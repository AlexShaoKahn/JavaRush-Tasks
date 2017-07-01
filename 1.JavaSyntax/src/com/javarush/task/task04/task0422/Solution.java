package com.javarush.task.task04.task0422;

/* 
18+
*/

import java.io.*;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        Scanner scanner = new Scanner(System.in);
        String n = scanner.next();
        int a = scanner.nextInt();
        if (a < 18) System.out.println("Подрасти еще");
    }
}
