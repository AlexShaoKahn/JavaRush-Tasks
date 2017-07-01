package com.javarush.task.task10.task1012;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Scanner;

/*
Количество букв
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        String abc = "абвгдеёжзийклмнопрстуфхцчшщъыьэюя";

        ArrayList<StringBuilder> alphabet = new ArrayList<>();
        for (int i = 0; i < abc.length(); i++) {
            alphabet.add(new StringBuilder().append(abc.charAt(i)));
        }

        ArrayList<String> list = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            list.add(scanner.nextLine().toLowerCase());
        }

        for (String s : list) {
            for (int i = 0; i < s.length(); i++) {
                for (int j = 0; j < alphabet.size(); j++) {
                    if (s.charAt(i) == alphabet.get(j).charAt(0)) alphabet.get(j).append(s.charAt(i));
                }
            }
        }
        for (StringBuilder stringBuilder : alphabet) {
            System.out.println(stringBuilder.charAt(0) + " " + (stringBuilder.length() - 1));
        }
    }

}
