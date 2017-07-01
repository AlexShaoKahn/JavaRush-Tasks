package com.javarush.task.task08.task0817;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;

/* 
Нам повторы не нужны
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

    public static void removeTheFirstNameDuplicates(HashMap<String, String> map) {
        //напишите тут ваш код
        HashMap<String, String> tempmap = (HashMap<String, String>) map.clone();
        for (Map.Entry<String, String> pair01 : tempmap.entrySet()) {
            for (Map.Entry<String, String> pair02 : tempmap.entrySet()) {
                if (!pair01.getKey().equals(pair02.getKey()) && pair01.getValue().equals(pair02.getValue())) {
                    removeItemFromMapByValue(map, pair02.getValue());
                }
            }
        }
    }

    public static void removeItemFromMapByValue(HashMap<String, String> map, String value) {
        HashMap<String, String> copy = new HashMap<String, String>(map);
        for (Map.Entry<String, String> pair : copy.entrySet()) {
            if (pair.getValue().equals(value))
                map.remove(pair.getKey());
        }
    }

    public static void main(String[] args) {

    }
}
