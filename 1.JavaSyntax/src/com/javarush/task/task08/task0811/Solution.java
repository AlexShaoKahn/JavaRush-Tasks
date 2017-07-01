package com.javarush.task.task08.task0811;

import java.util.ArrayList;
import java.util.Date;
import java.util.LinkedList;
import java.util.List;

/* 
Квартет «Методы»
*/

public class Solution {
    public static List getListForGet() {
        //напишите тут ваш код
        List arrayList = new ArrayList();
        for (int i = 0; i < 10000; i++) {
            arrayList.add(new Object());
        }
        long startArrayList, endArrayList;
        List linkedList = new LinkedList();
        for (int i = 0; i < 10000; i++) {
            linkedList.add(new Object());
        }
        long startLinkedList, endLinkedList;

        startArrayList = new Date().getTime();
        for (int i = 0; i < 10000; i++) {
            arrayList.get(i);
        }
        endArrayList = new Date().getTime();

        startLinkedList = new Date().getTime();
        for (int i = 0; i < 10000; i++) {
            linkedList.get(i);
        }
        endLinkedList = new Date().getTime();
        if (endLinkedList - startLinkedList < endArrayList - startArrayList) return new LinkedList();
        else return new ArrayList();
    }

    public static List getListForSet() {
        //напишите тут ваш код
        List arrayList = new ArrayList();
        for (int i = 0; i < 10000; i++) {
            arrayList.add(new Object());
        }
        long startArrayList, endArrayList;
        List linkedList = new LinkedList();
        for (int i = 0; i < 10000; i++) {
            linkedList.add(new Object());
        }
        long startLinkedList, endLinkedList;

        startArrayList = new Date().getTime();
        for (int i = 0; i < 10000; i++) {
            arrayList.set(i, new Object());
        }
        endArrayList = new Date().getTime();

        startLinkedList = new Date().getTime();
        for (int i = 0; i < 10000; i++) {
            linkedList.set(i, new Object());
        }
        endLinkedList = new Date().getTime();
        if (endLinkedList - startLinkedList < endArrayList - startArrayList) return new LinkedList();
        else return new ArrayList();
    }

    public static List getListForAddOrInsert() {
        //напишите тут ваш код
        List arrayList = new ArrayList();
        long startArrayList, endArrayList;
        List linkedList = new LinkedList();
        long startLinkedList, endLinkedList;

        startArrayList = new Date().getTime();
        for (int i = 0; i < 10000; i++) {
            arrayList.add(new Object());
        }
        endArrayList = new Date().getTime();

        startLinkedList = new Date().getTime();
        for (int i = 0; i < 10000; i++) {
            linkedList.add(new Object());
        }
        endLinkedList = new Date().getTime();
        if (endLinkedList - startLinkedList < endArrayList - startArrayList) return new LinkedList();
        else return new ArrayList();
    }

    public static List getListForRemove() {
        //напишите тут ваш код
        List arrayList = new ArrayList();
        for (int i = 0; i < 10000; i++) {
            arrayList.add(new Object());
        }
        long startArrayList, endArrayList;
        List linkedList = new LinkedList();
        for (int i = 0; i < 10000; i++) {
            linkedList.add(new Object());
        }
        long startLinkedList, endLinkedList;

        startArrayList = new Date().getTime();
        for (int i = 0; i < 10000; i++) {
            arrayList.remove(0);
        }
        endArrayList = new Date().getTime();

        startLinkedList = new Date().getTime();
        for (int i = 0; i < 10000; i++) {
            linkedList.remove(0);
        }
        endLinkedList = new Date().getTime();
        if (endLinkedList - startLinkedList < endArrayList - startArrayList) return new LinkedList();
        else return new ArrayList();
    }

    public static void main(String[] args) {
//        List listForGet = getListForGet();
//        System.out.println(listForGet.getClass());
//        List listForAdd = getListForAddOrInsert();
//        System.out.println(listForAdd.getClass());
//        List listForSet = getListForSet();
//        System.out.println(listForSet.getClass());
//        List listForRemove = getListForRemove();
//        System.out.println(listForRemove.getClass());
    }
}
