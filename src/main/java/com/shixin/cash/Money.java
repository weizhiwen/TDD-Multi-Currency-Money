package com.shixin.cash;

public class Money {
    protected int amount;

    @Override
    public boolean equals(Object object) {
        Money money = (Money) object;
        return this.amount == money.amount;
    }
}
