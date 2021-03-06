package com.javarush.task.task12.task1224;

/* 
Неведома зверушка
*/

import java.util.HashMap;

public class Solution {
    public static void main(String[] args) {
        System.out.println(getObjectType(new Cat()));
        System.out.println(getObjectType(new Tiger()));
        System.out.println(getObjectType(new Lion()));
        System.out.println(getObjectType(new Bull()));
        System.out.println(getObjectType(new Pig()));
    }

    public static String getObjectType(Object o) {
        //напишите тут ваш код
        HashMap<String, String> map = new HashMap<>();
        map.put("Cat", "Кот");
        map.put("Tiger", "Тигр");
        map.put("Lion", "Лев");
        map.put("Bull", "Бык");
        if (map.containsKey(o.getClass().getSimpleName())) return map.get(o.getClass().getSimpleName());
        else return "хз";
    }

    public static class Cat {
    }

    public static class Tiger {
    }

    public static class Lion {
    }

    public static class Bull {
    }

    public static class Pig {
    }
}
