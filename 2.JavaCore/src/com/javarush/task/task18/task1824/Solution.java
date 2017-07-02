package com.javarush.task.task18.task1824;

/* 
Файлы и исключения
*/

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        String fileName;
        List<InputStream> isList = new ArrayList<>();
        while (true) {
            fileName = scanner.nextLine();
            try {
                isList.add(new FileInputStream(fileName));
            } catch (FileNotFoundException e) {
                for (InputStream is : isList) {
                    is.close();
                }
                System.out.println(fileName);
                break;
            }
        }
        scanner.close();
    }
}
