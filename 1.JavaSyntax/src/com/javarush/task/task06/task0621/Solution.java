package com.javarush.task.task06.task0621;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Scanner;

/* 
Родственные связи кошек
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        Cat grandfather = new Cat(scanner.nextLine(), null, null);
        Cat grandmother = new Cat(scanner.nextLine(), null, null);
        Cat father = new Cat(scanner.nextLine(), grandfather, null);
        Cat mother = new Cat(scanner.nextLine(), null, grandmother);
        Cat son = new Cat(scanner.nextLine(), father, mother);
        Cat daughter = new Cat(scanner.nextLine(), father, mother);

        System.out.println(grandfather);
        System.out.println(grandmother);
        System.out.println(father);
        System.out.println(mother);
        System.out.println(son);
        System.out.println(daughter);
    }

    public static class Cat {
        private String name;
        private Cat father;
        private Cat mother;

        public Cat(String name, Cat father, Cat mother) {
            this.name = name;
            this.father = father;
            this.mother = mother;
        }

        @Override
        public String toString() {
            String cat;
            cat = "Cat name is " + name;
            if (mother != null) cat += ", mother is " + mother.name;
            else cat += ", no mother";
            if (father != null) cat += ", father is " + father.name;
            else cat += ", no father";
            return cat;
        }
    }

}
