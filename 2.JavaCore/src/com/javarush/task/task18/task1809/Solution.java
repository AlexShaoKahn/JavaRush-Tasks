package com.javarush.task.task18.task1809;

/* 
Реверс файла
*/

import java.io.*;
import java.util.*;

public class Solution {
    public static void main(String[] args) throws IOException {
        /*
        Scanner scanner = new Scanner(System.in);

        String fn01 = scanner.nextLine();
        String fn02 = scanner.nextLine();
        scanner.close();
        */
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String fn01 = reader.readLine();
        String fn02 = reader.readLine();
        reader.close();
        FileInputStream is = new FileInputStream(fn01);
        FileOutputStream os = new FileOutputStream(fn02);

        //InputStream is = new FileInputStream(fn01);
        //OutputStream os = new FileOutputStream(fn02);

        byte[] buffer = new byte[is.available()];
        is.read(buffer);
        is.close();

        for (int i = buffer.length - 1; i >= 0; i--) {
            os.write(buffer[i]);
        }
        os.close();
    }
}
