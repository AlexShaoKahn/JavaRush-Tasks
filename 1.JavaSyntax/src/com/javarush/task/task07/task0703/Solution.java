package com.javarush.task.task07.task0703;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

/*
Общение одиноких массивов
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        Scanner scanner = new Scanner(System.in);
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String[] sarray = new String[10];
        int[] iarray = new int[10];
        for (int i = 0; i < sarray.length; i++) {
            sarray[i] = reader.readLine();
            iarray[i] = sarray[i].length();
        }
        for (int i : iarray) {
            System.out.println(i);
        }
    }
}
