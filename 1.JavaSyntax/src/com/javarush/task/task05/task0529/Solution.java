package com.javarush.task.task05.task0529;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

/*
Консоль-копилка
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        Scanner scanner = new Scanner(System.in);
        int summ = 0;
        String k = "";
        while (!k.equals("сумма")) {
            k = scanner.nextLine();
            if (!k.equals("сумма")) summ += Integer.valueOf(k);
        }
        System.out.println(summ);
    }
}
