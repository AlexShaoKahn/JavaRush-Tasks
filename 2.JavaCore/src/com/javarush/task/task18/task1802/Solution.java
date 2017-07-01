package com.javarush.task.task18.task1802;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Scanner;

/* 
Минимальный байт
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        InputStream inputStream = new FileInputStream(scanner.nextLine());
        scanner.close();
        int minByte = Integer.MAX_VALUE;
        int readByte;
        while (inputStream.available() > 0) {
            readByte = inputStream.read();
            minByte = readByte < minByte ? readByte : minByte;
        }
        inputStream.close();
        System.out.println(minByte);
    }
}
