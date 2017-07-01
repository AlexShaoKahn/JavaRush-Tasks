package com.javarush.task.task07.task0712;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Scanner;

/*
Самые-самые
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        ArrayList<String> list = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        int j = -1;
        for (int i = 0; i < 10; i++) {
            list.add(scanner.nextLine());
            max = max < list.get(i).length() ? list.get(i).length() : max;
            min = min > list.get(i).length() ? list.get(i).length() : min;
        }
        do {
            j++;
            if (list.get(j).length() == min || list.get(j).length() == max) System.out.println(list.get(j));
        } while (j < list.size() && list.get(j).length() != min && list.get(j).length() != max);
    }
}
