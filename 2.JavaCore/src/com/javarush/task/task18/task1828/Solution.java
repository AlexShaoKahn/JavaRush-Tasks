package com.javarush.task.task18.task1828;

/*
Прайсы 2
*/

import java.io.*;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) throws IOException {
        //generating data file
        /*
        OutputStream os = new FileOutputStream("t:\\temp00.txt");
        Random random = new Random();
        for (int i = 0; i < 1000; i++) {
            os.write(String.format("%-8s%-30s%-8s%-4s%n", i, "productName-" + i, 1.0 * Math.round(random.nextDouble() * 100000) / 100, random.nextInt(1000)).getBytes());
        }
        os.close();
        */

        //autoparams
        /*
        int params = 2;
        switch (params) {
            case 1:
                args = new String[]{"-u", "300", "newProductName", "200", "10"};
                break;
            case 2:
                args = new String[]{"-d", "300"};
                break;
        }
        */

        if (args[0].equals("-u")) {
            List<String> list = new LinkedList<>();
            String fileName = new Scanner(System.in).nextLine();
            BufferedReader br = new BufferedReader(new FileReader(fileName));
            String line;
            while ((line = br.readLine()) != null) {
                if (line.substring(0, 8).trim().equals(args[1]))
                    list.add(String.format("%-8s%-30s%-8s%-4s%n", args[1], args[2], args[3], args[4]));
                else list.add(line + "\n");
            }
            br.close();
            BufferedWriter bw = new BufferedWriter(new FileWriter(fileName));
            for (String s : list) {
                bw.write(s);
            }
            bw.close();
        } else if (args[0].equals("-d")) {
            List<String> list = new LinkedList<>();
            String fileName = new Scanner(System.in).nextLine();
            BufferedReader br = new BufferedReader(new FileReader(fileName));
            String line;
            while ((line = br.readLine()) != null) {
                if (!line.substring(0, 8).trim().equals(args[1])) list.add(line + "\n");
            }
            br.close();
            BufferedWriter bw = new BufferedWriter(new FileWriter(fileName));
            for (String s : list) {
                bw.write(s);
            }
            bw.close();
        }
    }
}
