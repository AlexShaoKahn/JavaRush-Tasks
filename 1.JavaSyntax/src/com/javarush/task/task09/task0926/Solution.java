package com.javarush.task.task09.task0926;

import java.util.ArrayList;
import java.util.Random;

/*
Список из массивов чисел
*/

public class Solution {
    public static void main(String[] args) {
        ArrayList<int[]> list = createList();
        printList(list);
    }

    public static ArrayList<int[]> createList() {
        //напишите тут ваш код
        int[] nums = new int[]{5, 2, 4, 7, 0};
        Random random = new Random();
        ArrayList<int[]> arrayList = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            int[] arr = new int[nums[i]];
            for (int j = 0; j < nums[i]; j++) {
                arr[j] = random.nextInt(100);
            }
            arrayList.add(arr);
        }
        return arrayList;
    }

    public static void printList(ArrayList<int[]> list) {
        for (int[] array : list) {
            for (int x : array) {
                System.out.println(x);
            }
        }
    }
}
