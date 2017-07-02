package com.javarush.task.task18.task1816;

/* 
Английские буквы
*/

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

public class Solution {
    public static void main(String[] args) throws IOException {
        //args=new String[1];
        //args[0]="t:\\temp03.txt";
        int aCount = 0;
        InputStream inputStream = new FileInputStream(args[0]);
        while (inputStream.available() > 0) {
            int aByte = inputStream.read();
            if ((aByte >= 65 && aByte <= 90) || (aByte >= 97 && aByte <= 122)) aCount++;
        }
        System.out.println(aCount);
        inputStream.close();
    }
}
