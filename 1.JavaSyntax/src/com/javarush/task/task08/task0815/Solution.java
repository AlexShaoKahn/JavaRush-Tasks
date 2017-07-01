package com.javarush.task.task08.task0815;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Random;

/* 
Перепись населения
*/

public class Solution {
    public static HashMap<String, String> createMap() {
        //напишите тут ваш код
        HashMap<String, String> hashMap = new HashMap<>();
        Random random = new Random();
        for (int i = 0; i < 10; i++) {
            hashMap.put(Integer.toString(i), Integer.toString(random.nextInt(10)));
        }
        return hashMap;
    }

    public static int getCountTheSameFirstName(HashMap<String, String> map, String name) {
        //напишите тут ваш код
        int count = 0;
        for (String s : map.values()) {
            if (s.equals(name)) count++;
        }
        return count;
    }

    public static int getCountTheSameLastName(HashMap<String, String> map, String lastName) {
        //напишите тут ваш код
        int count = 0;
        for (String s : map.keySet()) {
            if (s.equals(lastName)) count++;
        }
        return count;
    }

    public static void main(String[] args) {
//        HashMap<String, String> hashMap = createMap();
//        System.out.println(hashMap);
//        System.out.println(getCountTheSameFirstName(hashMap, "5"));
//        System.out.println(getCountTheSameLastName(hashMap, "5"));
    }
}
