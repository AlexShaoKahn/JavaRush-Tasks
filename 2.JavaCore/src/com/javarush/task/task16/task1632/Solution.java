package com.javarush.task.task16.task1632;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Solution {
    public static List<Thread> threads = new ArrayList<>(5);

    static {
        for (int i = 1; i <= 5; i++) {
            threads.add(MyThreadFactory.getMyThread(i));
        }
    }

    public static void main(String[] args) {
        threads.get(4).start();
    }
}