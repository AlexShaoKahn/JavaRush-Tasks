package com.javarush.task.task18.task1808;

/* 
Разделение файла
*/

import java.io.*;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        String filename01 = scanner.nextLine();
        String filename02 = scanner.nextLine();
        String filename03 = scanner.nextLine();
        InputStream is01 = new FileInputStream(filename01);
        OutputStream os02 = new FileOutputStream(filename02);
        OutputStream os03 = new FileOutputStream(filename03);
        scanner.close();
        if (is01.available() % 2 != 0) {
            byte[] buffer01 = new byte[is01.available() / 2 + 1];
            byte[] buffer02 = new byte[is01.available() - (is01.available() / 2 + 1)];
            is01.read(buffer01);
            is01.read(buffer02);
            os02.write(buffer01);
            os03.write(buffer02);

        } else {
            byte[] buffer01 = new byte[is01.available() / 2];
            byte[] buffer02 = new byte[is01.available() - (is01.available() / 2)];
            is01.read(buffer01);
            is01.read(buffer02);
            os02.write(buffer01);
            os03.write(buffer02);

        }
        is01.close();
        os02.close();
        os03.close();
    }
}
