package com.javarush.task.task18.task1810;

/* 
DownloadException
*/

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) throws DownloadException, IOException {
        do {
            Scanner scanner = new Scanner(System.in);
            InputStream is = new FileInputStream(scanner.nextLine());
            if (is.available() < 1000) {
                scanner.close();
                is.close();
                throw new DownloadException();
            }
            is.close();
            scanner.close();
        } while (true);
    }

    public static class DownloadException extends Exception {

    }
}
