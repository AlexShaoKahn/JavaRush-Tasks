package com.javarush.task.task17.task1710;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;

/* 
CRUD
*/

public class Solution {
    public static List<Person> allPeople = new ArrayList<Person>();
    public static SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy", Locale.ENGLISH);

    static {
        allPeople.add(Person.createMale("Иванов Иван", new Date()));  //сегодня родился    id=0
        allPeople.add(Person.createMale("Петров Петр", new Date()));  //сегодня родился    id=1
    }

    public static void main(String[] args) throws ParseException {
        //start here - начни тут
        if (args.length > 0) {
            if (args[0].toLowerCase().equals("-c")) addPerson(args[1], args[2], args[3]);
            else if (args[0].toLowerCase().equals("-u")) updatePerson(args[1], args[2], args[3], args[4]);
            else if (args[0].toLowerCase().equals("-d")) deletePerson(args[1]);
            else if (args[0].toLowerCase().equals("-i")) printPerson(args[1]);
        }
    }

    public static void addPerson(String name, String sex, String date) throws ParseException {
        allPeople.add(Person.createMale(null, null));
        Person person = allPeople.get(allPeople.size() - 1);
        person.setName(name);
        person.setBirthDay(sdf.parse(date));
        person.setSex(sex.toLowerCase().equals("м") ? Sex.MALE : Sex.FEMALE);
        System.out.println(allPeople.size() - 1);
    }

    public static void updatePerson(String index, String name, String sex, String date) throws ParseException {
        Person person = allPeople.get(Integer.parseInt(index));
        person.setName(name);
        person.setBirthDay(sdf.parse(date));
        person.setSex(sex.toLowerCase().equals("м") ? Sex.MALE : Sex.FEMALE);
        allPeople.set(Integer.parseInt(index), person);
    }

    public static void deletePerson(String index) {
        Person person = allPeople.get(Integer.parseInt(index));
        person.setName(null);
        person.setBirthDay(null);
        person.setSex(null);
        allPeople.set(Integer.parseInt(index), person);
    }

    public static void printPerson(String index) {
        SimpleDateFormat sdf = new SimpleDateFormat("dd-MMM-yyyy", Locale.ENGLISH);
        Person person = allPeople.get(Integer.parseInt(index));
        if (person.getSex() == Sex.MALE) {
            System.out.printf("%s %s %s%n", person.getName(), "м", sdf.format(person.getBirthDay()));
        } else {
            System.out.printf("%s %s %s%n", person.getName(), "ж", sdf.format(person.getBirthDay()));
        }
    }

}
