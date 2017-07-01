package com.javarush.task.task14.task1420;

/* 
НОД
*/

import java.util.InputMismatchException;
import java.util.Scanner;

public class Solution {
    public static int gcd(int a, int b) {
        while (b != 0) {
            int tmp = a % b;
            a = b;
            b = tmp;
        }
        return a;
    }

    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        /*try {
            a = Math.abs((int) scanner.nextInt());
        } catch (InputMismatchException e) {
            throw new InputMismatchException();
        }
        try {
            b = Math.abs((int) scanner.nextInt());
        } catch (InputMismatchException e) {
            throw new InputMismatchException();
        }*/

        if (a <= 0) {
            throw new NumberFormatException();
        }
        if (b <= 0) {
            throw new NumberFormatException();
        }

        System.out.println(gcd(a, b));

        scanner.close();
    }
}
