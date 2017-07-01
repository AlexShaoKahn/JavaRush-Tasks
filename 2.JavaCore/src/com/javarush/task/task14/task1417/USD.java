package com.javarush.task.task14.task1417;

/**
 * Created by Shao on 20.06.2017.
 */
public class USD extends Money {
    public USD(double amount) {
        super(amount);
    }

    @Override
    public String getCurrencyName() {
        return "USD";
    }
}
