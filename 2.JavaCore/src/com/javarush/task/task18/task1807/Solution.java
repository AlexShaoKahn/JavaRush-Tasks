package com.javarush.task.task18.task1807;

/*
Подсчет запятых
*/

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        InputStream inputStream = new FileInputStream(scanner.nextLine());
        scanner.close();
        int sCount = 0;
        int readByte;
        while (inputStream.available() > 0) {
            readByte = inputStream.read();
            if (readByte == 44) sCount++;
        }
        System.out.println(sCount);
        inputStream.close();
    }
}
