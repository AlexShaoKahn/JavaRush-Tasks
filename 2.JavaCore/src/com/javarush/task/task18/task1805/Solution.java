package com.javarush.task.task18.task1805;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.*;

/*
Сортировка байт
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        ArrayList<Integer> arrayList = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        InputStream inputStream = new FileInputStream(scanner.nextLine());
        scanner.close();
        int readByte;
        while (inputStream.available() > 0) {
            readByte = inputStream.read();
            if (!arrayList.contains(readByte)) arrayList.add(readByte);
        }
        inputStream.close();
        Collections.sort(arrayList);
        for (Integer i : arrayList) {
            System.out.print(i + " ");
        }
    }
}
