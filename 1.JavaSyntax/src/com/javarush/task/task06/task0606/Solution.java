package com.javarush.task.task06.task0606;

import java.io.*;
import java.util.Scanner;

/*
Чётные и нечётные циферки
*/

public class Solution {

    public static int even;
    public static int odd;

    public static void main(String[] args) throws IOException {
        //напишите тут ваш код
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        do {
            if (number % 10 % 2 == 0) even++;
            else odd++;
            number /= 10;
        }
        while (!(number < 1));
        System.out.println("Even: " + even + " Odd: " + odd);
    }
}
