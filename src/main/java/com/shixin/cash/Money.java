package com.shixin.cash;

public abstract class Money {
    protected int amount;

    public static Dollar dollar(int amount) {
        return new Dollar(amount);
    }

    public static Franc franc(int amount) {
        return new Franc(amount);
    }

    abstract Money times(int multiplier);

    @Override
    public boolean equals(Object object) {
        if (object == null) {
            return false;
        }
        Money money = (Money) object;
        return this.amount == money.amount && getClass().equals(money.getClass());
    }
}
