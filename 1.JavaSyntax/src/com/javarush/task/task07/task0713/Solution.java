package com.javarush.task.task07.task0713;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

/*
Играем в Jолушку
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        ArrayList<Integer> list = new ArrayList<Integer>();
        ArrayList<Integer> list2 = new ArrayList<Integer>();
        ArrayList<Integer> list1 = new ArrayList<Integer>();
        ArrayList<Integer> list3 = new ArrayList<Integer>();
        for (int i = 0; i < 20; i++) {
            //list.add(random.nextInt(100));
            list.add(scanner.nextInt());
        }
        for (int i : list) {
            if (i % 2 == 0) list1.add(i);
            if (i % 3 == 0) list2.add(i);
            if (i % 2 != 0 && i % 3 != 0) list3.add(i);
        }
        printList(list2);
        printList(list1);
        printList(list3);
    }

    public static void printList(List<Integer> list) {
        //напишите тут ваш код
        for (int i : list) {
            System.out.println(i);
        }
        //System.out.println("");
    }
}
