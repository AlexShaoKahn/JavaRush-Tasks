package com.javarush.task.task15.task1519;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.Scanner;

/* 
Разные методы для разных типов
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        //напиште тут ваш код
        Scanner scanner = new Scanner(System.in);
        String s = "";
        while (!s.toLowerCase().equals("exit")) {
            s = scanner.nextLine();
            if (s.toLowerCase().equals("exit")) break;

            try {
                if (s.contains(".")) print(Double.parseDouble(s));
                else if (Short.parseShort(s) > 0 && Short.parseShort(s) < 128) print(Short.parseShort(s));
                else if (Integer.parseInt(s) <= 0 || Integer.parseInt(s) >= 128) print(Integer.parseInt(s));
                else print(s);
            } catch (NumberFormatException e1) {
                try {
                    if (Short.parseShort(s) > 0 && Short.parseShort(s) < 128) print(Short.parseShort(s));
                    else if (Integer.parseInt(s) <= 0 || Integer.parseInt(s) >= 128) print(Integer.parseInt(s));
                    else print(s);
                } catch (NumberFormatException e2) {
                    try {
                        if (Integer.parseInt(s) <= 0 || Integer.parseInt(s) >= 128) print(Integer.parseInt(s));
                        else print(s);
                    } catch (NumberFormatException e3) {
                        print(s);

                    }
                }
            }

            /*if (s.contains(".")) print(Double.parseDouble(s));
            else if (Short.parseShort(s)>0&&Short.parseShort(s)<128) print(Short.parseShort(s));
            else if (Integer.parseInt(s)<0||Integer.parseInt(s)>=128) print(Integer.parseInt(s));
            else print(s);*/
        }

        scanner.close();
    }

    public static void print(Double value) {
        System.out.println("Это тип Double, значение " + value);
    }

    public static void print(String value) {
        System.out.println("Это тип String, значение " + value);
    }

    public static void print(short value) {
        System.out.println("Это тип short, значение " + value);
    }

    public static void print(Integer value) {
        System.out.println("Это тип Integer, значение " + value);
    }
}
