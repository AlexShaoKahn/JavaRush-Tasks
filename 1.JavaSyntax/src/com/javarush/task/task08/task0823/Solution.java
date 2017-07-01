package com.javarush.task.task08.task0823;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* 
Омовение Рамы
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String s = reader.readLine();
        String s1 = new String();

        //напишите тут ваш код
        for (int i = 0; i < s.length(); i++) {
            if (i == 0) s1 += Character.toString(Character.toUpperCase(s.charAt(i)));
            else if (s.charAt(i - 1) == ' ') s1 += Character.toString(Character.toUpperCase(s.charAt(i)));
            else s1 += s.charAt(i);
        }
        System.out.println(s1);
    }
}
