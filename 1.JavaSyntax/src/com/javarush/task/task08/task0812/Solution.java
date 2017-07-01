package com.javarush.task.task08.task0812;

import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

/*
Cамая длинная последовательность
*/
public class Solution {
    public static void main(String[] args) throws IOException {
        //напишите тут ваш код
        ArrayList<Integer> list = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < 10; i++) {
            list.add(scanner.nextInt());
        }
        int sequence = 1;
        int count = 1;
        for (int i = 1; i < list.size(); i++) {
            while (i < list.size() && list.get(i) == list.get(i - 1)) {
                count++;
                i++;
            }
            sequence = sequence < count ? count : sequence;
            count = 1;
        }
        System.out.println(sequence);
    }
}