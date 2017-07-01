package com.javarush.task.task16.task1630;

import javax.sql.rowset.CachedRowSet;
import java.io.*;
import java.nio.charset.Charset;
import java.util.Scanner;

public class Solution {
    public static String firstFileName;
    public static String secondFileName;

    //add your code here - добавьте код тут
    static {
        Scanner scanner = new Scanner(System.in);
        firstFileName = scanner.nextLine();
        secondFileName = scanner.nextLine();
//        firstFileName="d:\\shao\\temp\\temp01.txt";
//        secondFileName="d:\\shao\\temp\\temp02.txt";
        scanner.close();
    }

    public static void main(String[] args) throws InterruptedException {
        systemOutPrintln(firstFileName);
        systemOutPrintln(secondFileName);
    }

    public static void systemOutPrintln(String fileName) throws InterruptedException {
        ReadFileInterface f = new ReadFileThread();
        f.setFileName(fileName);
        f.start();
        f.join();
        //add your code here - добавьте код тут
        System.out.println(f.getFileContent());
    }

    public interface ReadFileInterface {
        void setFileName(String fullFileName);

        String getFileContent();

        void join() throws InterruptedException;

        void start();
    }

    public static class ReadFileThread extends Thread implements ReadFileInterface {
        private String fromFileName;
        private StringBuilder result = new StringBuilder();

        @Override
        public void setFileName(String fullFileName) {
            fromFileName = fullFileName;
        }

        @Override
        public String getFileContent() {
            return result.toString();
        }

        @Override
        public void run() {
            try {
                BufferedReader br = new BufferedReader(new InputStreamReader((new FileInputStream(fromFileName)), Charset.forName("UTF-8")));
                String line;
                while ((line = br.readLine()) != null) result.append(line).append(" ");
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
    //add your code here - добавьте код тут
}
