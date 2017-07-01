package com.javarush.task.task08.task0818;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;

/* 
Только для богачей
*/

public class Solution {
    public static HashMap<String, Integer> createMap() {
        //напишите тут ваш код
        HashMap<String, Integer> hashMap = new HashMap<>();
        Random random = new Random();
        for (int i = 0; i < 10; i++) {
            hashMap.put(Integer.toString(i), random.nextInt(1000));
        }
        return hashMap;
    }

    public static void removeItemFromMap(HashMap<String, Integer> map) {
        //напишите тут ваш код
        HashMap<String, Integer> tmap = new HashMap<>(map);
        for (Map.Entry<String, Integer> pair : tmap.entrySet()) {
            if (pair.getValue() < 500) map.remove(pair.getKey());
        }
    }

    public static void main(String[] args) {

    }
}