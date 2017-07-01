package com.javarush.task.task03.task0318;

/* 
План по захвату мира
*/


import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        InputStream inputStream = System.in;
        Reader inputStreamReader = new InputStreamReader(inputStream);
        BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
        String name = bufferedReader.readLine();
        String sAge = bufferedReader.readLine();
        System.out.println(name + " захватит мир через " + sAge + " лет. Му-ха-ха!");
    }
}
