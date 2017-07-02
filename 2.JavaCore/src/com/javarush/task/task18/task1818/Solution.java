package com.javarush.task.task18.task1818;

/* 
Два в одном
*/

import java.io.*;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        String f01 = scanner.nextLine();
        String f02 = scanner.nextLine();
        String f03 = scanner.nextLine();
        scanner.close();

        OutputStream os = new FileOutputStream(f01);
        InputStream is01 = new FileInputStream(f02);
        InputStream is02 = new FileInputStream(f03);

        byte[] buffer01 = new byte[is01.available()];
        byte[] buffer02 = new byte[is02.available()];

        is01.read(buffer01);
        is02.read(buffer02);

        is01.close();
        is02.close();

        os.write(buffer01);
        os.write(buffer02);

        os.close();
    }
}
