package com.javarush.task.task18.task1821;

/* 
Встречаемость символов
*/

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.HashMap;
import java.util.Map;

public class Solution {
    public static void main(String[] args) throws IOException {
        //args = new String[1];
        //args[0] = "t:\\temp01.txt";
        InputStream is = new FileInputStream(args[0]);
        Map<Integer, Integer> map = new HashMap<>();
        int rByte;

        while (is.available() > 0) {
            rByte = is.read();
            if (map.containsKey(rByte)) map.replace(rByte, map.get(rByte) + 1);
            else map.put(rByte, 1);
        }

        for (int i = 0; i < 255; i++) {
            if (map.containsKey(i)) {
                System.out.println((char) i + " " + map.get(i));
            }
        }

        is.close();
    }
}
