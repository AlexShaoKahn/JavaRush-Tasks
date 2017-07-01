package com.javarush.task.task14.task1411;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
User, Looser, Coder and Proger
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        Person person = null;

        //тут цикл по чтению ключей, пункт 1
        String key = reader.readLine().toLowerCase();
        while (key.equals("user") || key.equals("loser") || key.equals("coder") || key.equals("proger")) {
            switch (key) {
                case "user":
                    doWork(new Person.User());
                    break;
                case "loser":
                    doWork(new Person.Loser());
                    break;
                case "coder":
                    doWork(new Person.Coder());
                    break;
                case "proger":
                    doWork(new Person.Proger());
                    break;
            }
            key = reader.readLine().toLowerCase();
        }
        reader.close();
    }

    public static void doWork(Person person) {
        // пункт 3
        if (person instanceof Person.User) ((Person.User) person).live();
        else if (person instanceof Person.Loser) ((Person.Loser) person).doNothing();
        else if (person instanceof Person.Coder) ((Person.Coder) person).coding();
        else ((Person.Proger) person).enjoy();
        /*
        switch (person.getClass().getSimpleName()) {
            case "User":
                ((Person.User)person).live();
                break;
            case "Loser":
                ((Person.Loser)person).doNothing();
                break;
            case "Coder":
                ((Person.Coder)person).coding();
                break;
            case "Proger":
                ((Person.Proger)person).enjoy();
                break;
        }
        */
    }
}
