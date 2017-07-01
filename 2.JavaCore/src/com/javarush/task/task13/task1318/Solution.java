package com.javarush.task.task13.task1318;

import java.io.*;
import java.util.Scanner;

/*
Чтение файла
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String fileName = reader.readLine();

        FileInputStream stream = new FileInputStream(fileName);

        while (stream.available() > 0) {
            System.out.print((char) stream.read());
        }
        System.out.println();

        reader.close();
        stream.close();
    }
}