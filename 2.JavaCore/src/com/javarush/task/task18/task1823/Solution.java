package com.javarush.task.task18.task1823;

import java.io.*;
import java.util.*;

/* 
Нити и байты
*/

public class Solution {
    public static Map<String, Integer> resultMap = new HashMap<String, Integer>();

    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        String fileName;
        List<String> fileList = new ArrayList<>();
        while (!(fileName = scanner.nextLine()).equals("exit")) {
            if (!fileList.contains(fileName)) fileList.add(fileName);
        }
        for (String s : fileList) {
            new ReadThread(s).start();
        }

    }

    public static class ReadThread extends Thread {
        private String fileName;
        private InputStream is;
        private int rByte;
        private int maxByteValue = Integer.MIN_VALUE;
        private int maxByteKey;
        private Map<Integer, Integer> map = new HashMap<>();

        public ReadThread(String fileName) throws FileNotFoundException {
            //implement constructor body
            this.fileName = fileName;
        }
        // implement file reading here - реализуйте чтение из файла тут

        @Override
        public void run() {
            super.run();
            try {
                is = new FileInputStream(fileName);
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            }
            try {
                while (is.available() > 0) {
                    rByte = is.read();
                    if (map.containsKey(rByte)) map.replace(rByte, map.get(rByte) + 1);
                    else map.put(rByte, 1);
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
            for (Map.Entry<Integer, Integer> pair : map.entrySet()) {
                if (maxByteValue < pair.getValue()) {
                    maxByteValue = pair.getValue();
                    maxByteKey = pair.getKey();
                }
            }
            try {
                is.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
            synchronized (Solution.class) {
                resultMap.put(fileName, maxByteKey);
            }
        }
    }
}
