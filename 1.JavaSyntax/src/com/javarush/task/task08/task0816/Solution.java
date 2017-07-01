package com.javarush.task.task08.task0816;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/* 
Добрая Зинаида и летние каникулы
*/

public class Solution {
    public static HashMap<String, Date> createMap() {
        HashMap<String, Date> map = new HashMap<String, Date>();
        map.put("Stallone0", new Date("JUNE 1 1980"));
        map.put("Stallone1", new Date("JULY 1 1980"));
        map.put("Stallone2", new Date("AUGUST 1 1980"));
        map.put("Stallone3", new Date("SEPTEMBER 1 1980"));
        map.put("Stallone4", new Date("OCTOBER 1 1980"));
        map.put("Stallone5", new Date("NOVEMBER 1 1980"));
        map.put("Stallone6", new Date("DECEMBER 1 1980"));
        map.put("Stallone7", new Date("JANUARY 1 1981"));
        map.put("Stallone8", new Date("FEBRUARY 1 1981"));
        map.put("Stallone9", new Date("MARCH 1 1981"));

        //напишите тут ваш код
        return map;
    }

    public static void removeAllSummerPeople(HashMap<String, Date> map) {
        //напишите тут ваш код
        HashMap<String, Date> maptemp = (HashMap<String, Date>) map.clone();
        for (Map.Entry<String, Date> pair : maptemp.entrySet()) {
            if (pair.getValue().getMonth() == 5 || pair.getValue().getMonth() == 6 || pair.getValue().getMonth() == 7)
                map.remove(pair.getKey());
        }
    }

    public static void main(String[] args) {
//        HashMap<String, Date> map = createMap();
//        System.out.println(map);
//        removeAllSummerPeople(map);
//        System.out.println(map);
    }
}
