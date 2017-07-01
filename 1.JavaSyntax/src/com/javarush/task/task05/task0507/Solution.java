package com.javarush.task.task05.task0507;

/* 
Среднее арифметическое
*/

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        int i = 0;
        int k = 0;
        Scanner scanner = new Scanner(System.in);
        double summ = 0;
        while (k != -1) {
            k = scanner.nextInt();
            if (k != -1) {
                summ += k;
                i++;
            }
        }
        System.out.println(summ / i);
    }
}

