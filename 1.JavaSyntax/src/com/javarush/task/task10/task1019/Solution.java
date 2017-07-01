package com.javarush.task.task10.task1019;

import java.io.*;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/*
Функциональности маловато!
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        HashMap<String, String> map = new HashMap<>();
        while (true) {
            String num = scanner.nextLine();
            if (num.isEmpty()) break;
            String word = scanner.nextLine();
            if (word.isEmpty()) break;
            map.put(word, num);
        }
        for (Map.Entry<String, String> stringStringEntry : map.entrySet()) {
            System.out.println(stringStringEntry.getValue() + " " + stringStringEntry.getKey());
        }
    }
}
