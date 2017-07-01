package com.javarush.task.task17.task1721;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/* 
Транзакционность
*/

public class Solution {
    public static List<String> allLines = new ArrayList<String>();
    public static List<String> forRemoveLines = new ArrayList<String>();

    public static void main(String[] args) throws IOException {
        String line;
        Scanner scanner = new Scanner(System.in);
        String fileName01 = scanner.nextLine();
        String fileName02 = scanner.nextLine();
        File file01 = new File(fileName01);
        File file02 = new File(fileName02);
        FileReader fileReader01 = new FileReader(file01);
        FileReader fileReader02 = new FileReader(file02);
        BufferedReader bufferedReader01 = new BufferedReader(fileReader01);
        BufferedReader bufferedReader02 = new BufferedReader(fileReader02);

        line = bufferedReader01.readLine();
        while (line != null) {
            allLines.add(line);
            line = bufferedReader01.readLine();
        }

        line = bufferedReader02.readLine();
        while (line != null) {
            forRemoveLines.add(line);
            line = bufferedReader02.readLine();
        }

        try {
            new Solution().joinData();
        } catch (CorruptedDataException e) {
            e.printStackTrace();
        }

        bufferedReader01.close();
        bufferedReader02.close();
        fileReader01.close();
        fileReader02.close();
    }

    public void joinData() throws CorruptedDataException {
        if (allLines.containsAll(forRemoveLines)) allLines.removeAll(forRemoveLines);
        else {
            allLines.clear();
            throw new CorruptedDataException();
        }
    }
}
