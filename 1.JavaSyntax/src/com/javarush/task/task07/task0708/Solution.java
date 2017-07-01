package com.javarush.task.task07.task0708;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Scanner;

/*
Самая длинная строка
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        ArrayList<String> list = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < 5; i++) {
            list.add(scanner.nextLine());
        }
        for (String s : list) {
            max = s.length() > max ? s.length() : max;
        }
        for (String s : list) {
            if (s.length() == max) System.out.println(s);
        }
    }
}
