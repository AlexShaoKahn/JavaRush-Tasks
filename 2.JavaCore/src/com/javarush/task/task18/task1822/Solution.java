package com.javarush.task.task18.task1822;

/* 
Поиск данных внутри файла
*/

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        String fileName = scanner.nextLine();
        scanner.close();

        String line;
        BufferedReader br = new BufferedReader(new FileReader(fileName));

        while ((line = br.readLine()) != null) {
            if (args[0].equals(line.split(" ")[0])) System.out.println(line);
        }

        br.close();
    }
    /*
    public static class Product{
        private int id;
        private String productName="";
        private double price;
        private int quantity;
        Product(String line) {
            String[] aLine = line.split(" ");
            id=Integer.parseInt(aLine[0]);
            quantity=Integer.parseInt(aLine[aLine.length-1]);
            price=Double.parseDouble(aLine[aLine.length-2]);
            for (int i = 1; i < aLine.length-2; i++) {
                productName+=aLine[i]+" ";
            }
            productName=productName.substring(0,productName.length()-2);
        }
    }
    */
}
