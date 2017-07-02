package com.javarush.task.task18.task1820;

/*
Округление чисел
*/

import java.io.*;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        String f01 = scanner.nextLine();
        String f02 = scanner.nextLine();
        scanner.close();

        InputStream is = new FileInputStream(f01);
        OutputStream os = new FileOutputStream(f02);

        byte[] buffer = new byte[is.available()];
        is.read(buffer);
        String[] aBuffer = new String(buffer, "UTF-8").split(" ");
        String rNum;
        for (String s : aBuffer) {
            rNum = Integer.toString((int) Math.round(Double.parseDouble(s)));
            os.write(rNum.getBytes());
            os.write(32);
        }


        /*
        int rByte;
        boolean isNumber = true;
        while (is.available() > 0) {
            rByte = is.read();
            if (isNumber&&rByte>=48&&rByte<=57) os.write(rByte);
            else if (rByte==46) isNumber=false;
            else if (rByte==32) {
                isNumber=true;
                os.write(rByte);
            }
        }
        */

        os.close();
        is.close();
    }
}
