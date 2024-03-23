package com.shixin.cash;

public class Money {
    protected int amount;

    @Override
    public boolean equals(Object object) {
        if (object == null) {
            return false;
        }
        Money money = (Money) object;
        return this.amount == money.amount && getClass().equals(money.getClass());
    }
}
