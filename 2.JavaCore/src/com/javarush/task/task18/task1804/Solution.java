package com.javarush.task.task18.task1804;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/*
Самые редкие байты
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        Map<Integer, Integer> map = new HashMap<>();
        Scanner scanner = new Scanner(System.in);
        InputStream inputStream = new FileInputStream(scanner.nextLine());
        scanner.close();
        int readByte;
        while (inputStream.available() > 0) {
            readByte = inputStream.read();
            if (!map.containsKey(readByte)) map.put(readByte, 1);
            else map.replace(readByte, map.get(readByte) + 1);
        }
        inputStream.close();
        for (Map.Entry<Integer, Integer> pair : map.entrySet()) {
            if (pair.getValue() == 1) System.out.print(pair.getKey() + " ");
        }
    }
}
