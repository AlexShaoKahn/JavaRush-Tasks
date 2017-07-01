package com.javarush.task.task13.task1319;

import java.io.*;
import java.util.Scanner;

/*
Писатель в файл с консоли
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        // напишите тут ваш код
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter filename: t:\\");
        Writer writer = new FileWriter("t:\\" + scanner.nextLine());
        BufferedWriter bufferedWriter = new BufferedWriter(writer);

        System.out.println("Start entering text file:");
        String line;
        do {
            line = scanner.nextLine();
            bufferedWriter.write(line + System.getProperty("line.separator"));
        } while (!line.equals("exit"));

        bufferedWriter.close();
        writer.close();
        scanner.close();
    }
}
