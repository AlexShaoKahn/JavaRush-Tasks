package com.javarush.task.task18.task1826;

/* 
Шифровка
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException {
        InputStream is = new FileInputStream(args[1]);
        OutputStream os = new FileOutputStream(args[2]);

        while (is.available() > 0) {
            if (args[0].toLowerCase().equals("-e")) os.write(cryptByte(is.read()));
            else if (args[0].toLowerCase().equals("-d")) os.write(encryptByte(is.read()));
        }

        is.close();
        os.close();

    }

    public static int cryptByte(int i) {
        return i + 10;
    }

    public static int encryptByte(int i) {
        return i - 10;
    }
}
