package com.javarush.task.task09.task0923;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

/* 
Гласные и согласные
*/

public class Solution {
    public static char[] vowels = new char[]{'а', 'я', 'у', 'ю', 'и', 'ы', 'э', 'е', 'о', 'ё'};

    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        Scanner scanner = new Scanner(System.in);
        String word = scanner.nextLine();
        for (int i = 0; i < word.length(); i++) {
            if (word.charAt(i) != ' ' && isVowel(word.charAt(i))) {
                System.out.print(word.charAt(i));
                if (i != word.length() - 2) System.out.print(" ");
                else System.out.println(" ");
            }
        }
        for (int i = 0; i < word.length(); i++) {
            if (word.charAt(i) != ' ' && !isVowel(word.charAt(i))) {
                System.out.print(word.charAt(i));
                if (i != word.length() - 2) System.out.print(" ");
                else System.out.println(" ");
            }
        }
    }

    // метод проверяет, гласная ли буква
    public static boolean isVowel(char c) {
        c = Character.toLowerCase(c);  // приводим символ в нижний регистр - от заглавных к строчным буквам

        for (char d : vowels)   // ищем среди массива гласных
        {
            if (c == d)
                return true;
        }
        return false;
    }
}