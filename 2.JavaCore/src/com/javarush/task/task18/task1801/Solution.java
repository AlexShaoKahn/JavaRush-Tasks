package com.javarush.task.task18.task1801;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Scanner;

/*
Максимальный байт
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        InputStream inputStream = new FileInputStream(scanner.nextLine());
        scanner.close();
        int maxByte = Integer.MIN_VALUE;
        int readByte;
        while (inputStream.available() > 0) {
            readByte = inputStream.read();
            maxByte = readByte > maxByte ? readByte : maxByte;
        }
        inputStream.close();
        System.out.println(maxByte);
    }
}
