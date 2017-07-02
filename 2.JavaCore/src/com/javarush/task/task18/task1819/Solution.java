package com.javarush.task.task18.task1819;

/* 
Объединение файлов
*/

import java.io.*;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        String f01 = scanner.nextLine();
        String f02 = scanner.nextLine();
        scanner.close();

        InputStream is01 = new FileInputStream(f01);
        InputStream is02 = new FileInputStream(f02);
        byte[] buffer01 = new byte[is01.available()];
        byte[] buffer02 = new byte[is02.available()];
        is01.read(buffer01);
        is02.read(buffer02);
        is01.close();
        is02.close();

        OutputStream os = new FileOutputStream(f01);
        os.write(buffer02);
        os.write(buffer01);
        os.close();
    }
}
