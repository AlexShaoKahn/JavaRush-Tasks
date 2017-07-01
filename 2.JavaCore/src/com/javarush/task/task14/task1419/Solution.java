package com.javarush.task.task14.task1419;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;

/* 
Нашествие исключений
*/

public class Solution {
    public static List<Exception> exceptions = new ArrayList<Exception>();

    public static void main(String[] args) {
        initExceptions();

        for (Exception exception : exceptions) {
            System.out.println(exception);
        }
    }

    private static void initExceptions() {   //it's first exception
        try {
            float i = 1 / 0;
        } catch (ArithmeticException e) {
            exceptions.add(e);
        }
        try {
            int[] ints = new int[10];
            int anInt = ints[ints.length];
        } catch (ArrayIndexOutOfBoundsException e) {
            exceptions.add(e);
        }
        try {
            new ArrayList<>().get(100);
        } catch (IndexOutOfBoundsException e) {
            exceptions.add(e);
        }
        try {
            ArrayList<String> arrayList = null;
            arrayList.get(0);
        } catch (NullPointerException e) {
            exceptions.add(e);
        }
        try {
            int[] ints = new int[-100];
        } catch (NegativeArraySizeException e) {
            exceptions.add(e);
        }
        try {
            float i = 1 / 0;
        } catch (Exception e) {
            exceptions.add(e);
        }
        try {
            System.out.println(Integer.parseInt("null"));
        } catch (NumberFormatException e) {
            exceptions.add(e);
        }
        try {
            Integer integer = (Integer) (new Object());
        } catch (ClassCastException e) {
            exceptions.add(e);
        }
        try {
            FileInputStream fl = new FileInputStream("C:\\TEST.txt");
        } catch (FileNotFoundException e) {
            exceptions.add(e);
        }
        try {
            Class<?> aClass = Class.forName("");
        } catch (ClassNotFoundException e) {
            exceptions.add(e);
        }

        //напишите тут ваш код

    }
}
