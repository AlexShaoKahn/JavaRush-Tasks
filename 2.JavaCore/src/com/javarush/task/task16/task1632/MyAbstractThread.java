package com.javarush.task.task16.task1632;

import java.util.Scanner;

/**
 * Created by Shao on 25.06.2017.
 */
public abstract class MyAbstractThread extends Thread {
    protected void runInterrupt() {
        while (true) {
            try {
                Thread.sleep(1);
            } catch (InterruptedException e) {
                System.out.println("InterruptedException");
            }
        }
    }

    protected void runForever() {
        while (true) {
        }
    }

    protected void runIfNotInterrupted() {
        while (!isInterrupted()) {
            try {
                Thread.sleep(1);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    protected void runUra() throws InterruptedException {
        while (true) {
            System.out.println("Ура");
            Thread.sleep(500);
        }
    }

    protected void counter() {
        String s = "0";
        int summ = 0;
        Scanner scanner = new Scanner(System.in);
        while (!s.toLowerCase().equals("n")) {
            summ += Integer.parseInt(s);
            s = scanner.nextLine();
        }
        scanner.close();
        System.out.println(summ);
    }
}
