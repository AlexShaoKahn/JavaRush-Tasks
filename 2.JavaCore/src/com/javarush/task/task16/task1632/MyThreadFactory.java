package com.javarush.task.task16.task1632;

/**
 * Created by Shao on 25.06.2017.
 */
public class MyThreadFactory {
    public static Thread getMyThread(int i) {
        switch (i) {
            case 1:
                return new MyThread01();
            case 2:
                return new MyThread02();
            case 3:
                return new MyThread03();
            case 4:
                return new MyThread04();
            case 5:
                return new MyThread05();
            default:
                return null;
        }
    }
}

class MyThread01 extends MyAbstractThread {
    @Override
    public void run() {
        runForever();
    }
}

class MyThread02 extends MyAbstractThread {
    @Override
    public void run() {
        runInterrupt();
    }
}

class MyThread03 extends MyAbstractThread {
    @Override
    public void run() {
        try {
            runUra();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

class MyThread04 extends MyAbstractThread implements Message {
    @Override
    public void run() {
        runIfNotInterrupted();
    }

    @Override
    public void showWarning() {
        interrupt();
    }
}

class MyThread05 extends MyAbstractThread {
    @Override
    public void run() {
        counter();
    }
}
