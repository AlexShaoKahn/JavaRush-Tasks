package com.javarush.task.task18.task1825;

/* 
Собираем файл
*/

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) throws IOException {
        List<String> fileList = new ArrayList<>();
        String fileName;
        Scanner scanner = new Scanner(System.in);
        while (!(fileName = scanner.nextLine()).toLowerCase().contains("end")) {
            if (!fileList.contains(fileName)) fileList.add(fileName);
            else System.out.println("This filename(" + fileName + ") already exist!");
        }
        scanner.close();

        Collections.sort(fileList);

        //OutputStream os = new FileOutputStream(fileName.substring(0,fileName.lastIndexOf('.')-1));
        BufferedWriter br = new BufferedWriter(new FileWriter(fileList.get(0).substring(0, fileList.get(0).lastIndexOf('.'))));
        InputStream is;
        for (String s : fileList) {
            is = new FileInputStream(s);
            byte[] buffer = new byte[is.available()];
            is.read(buffer);
            is.close();
            br.write(new String(buffer));
        }
        br.close();
    }
}
