package com.shixin.cash;

import java.util.Hashtable;

public class Bank {
    private Hashtable<Pair, Integer> rates = new Hashtable<>();

    public Money reduce(Expression source, String to) {
        return source.reduce(this, to);
    }

    public void addRate(String from, String to, int i) {
        rates.put(new Pair(from, to), i);
    }

    public int rate(String from, String to) {
        if (from.equals(to)) {
            return 1;
        }
        return rates.get(new Pair(from, to));
    }
}
