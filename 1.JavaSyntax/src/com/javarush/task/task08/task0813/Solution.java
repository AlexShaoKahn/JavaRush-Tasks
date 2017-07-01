package com.javarush.task.task08.task0813;

import java.util.HashSet;
import java.util.Random;

/* 
20 слов на букву «Л»
*/

public class Solution {
    public static HashSet<String> createSet() {
        //напишите тут ваш код
        HashSet<String> hashSet = new HashSet<>();
        Random random = new Random();
        for (int i = 0; i < 20; i++) {
            hashSet.add("Л" + Integer.toString(random.nextInt(10000)));
        }
        return hashSet;
    }

    public static void main(String[] args) {

    }
}
