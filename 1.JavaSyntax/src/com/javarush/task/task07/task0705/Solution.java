package com.javarush.task.task07.task0705;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

/*
Один большой массив и два маленьких
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        Scanner scanner = new Scanner(System.in);
        int[] bigArray = new int[20];
        int[] smallArray01 = new int[10];
        int[] smallArray02 = new int[10];
        for (int i = 0; i < bigArray.length; i++) {
            bigArray[i] = scanner.nextInt();
        }
        for (int i = 0; i < bigArray.length / 2; i++) {
            smallArray01[i] = bigArray[i];
        }
        int k = 0;
        for (int i = bigArray.length / 2; i < bigArray.length; i++) {
            smallArray02[k] = bigArray[i];
            k++;
        }
        for (int i : smallArray02) {
            System.out.println(i);
        }
    }
}
