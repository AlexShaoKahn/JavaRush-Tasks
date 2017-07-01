package com.javarush.task.task12.task1205;

/* 
Определимся с животным
*/

import java.util.HashMap;

public class Solution {
    public static void main(String[] args) {
        System.out.println(getObjectType(new Cow()));
        System.out.println(getObjectType(new Dog()));
        System.out.println(getObjectType(new Whale()));
        System.out.println(getObjectType(new Pig()));
    }

    public static String getObjectType(Object o) {
        HashMap<String, String> map = new HashMap<>();
        map.put("Cow", "Корова");
        map.put("Dog", "Собака");
        map.put("Whale", "Кит");
        //Напишите тут ваше решение
        String simpleName = o.getClass().getSimpleName();
        if (map.containsKey(simpleName)) return map.get(simpleName);
        else return "Неизвестное животное";
    }

    public static class Cow {
    }

    public static class Dog {
    }

    public static class Whale {
    }

    public static class Pig {
    }
}
