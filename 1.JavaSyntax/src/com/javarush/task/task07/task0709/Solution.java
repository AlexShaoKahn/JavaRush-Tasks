package com.javarush.task.task07.task0709;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Scanner;

/*
Выражаемся покороче
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        ArrayList<String> list = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < 5; i++) {
            list.add(scanner.nextLine());
        }
        for (String s : list) {
            min = s.length() < min ? s.length() : min;
        }
        for (String s : list) {
            if (s.length() == min) System.out.println(s);
        }
    }
}
