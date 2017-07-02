package com.javarush.task.task18.task1817;

/* 
Пробелы
*/

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

public class Solution {
    public static void main(String[] args) throws IOException {
        //args=new String[1];
        //args[0]="t:\\temp03.txt";
        InputStream inputStream = new FileInputStream(args[0]);
        int sByte;

        int sCount = 0;
        int allSymbols = inputStream.available();

        while (inputStream.available() > 0) {
            sByte = inputStream.read();
            if (sByte == 32) sCount++;
        }

        System.out.format("%.2f", 1.0 * sCount / allSymbols * 100);
        inputStream.close();
    }
}
