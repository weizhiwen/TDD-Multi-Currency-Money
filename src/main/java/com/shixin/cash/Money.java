package com.shixin.cash;

public class Money {
    public static final String CHF = "CHF";
    public static final String USD = "USD";

    protected int amount;
    protected String currency;

    public Money(int amount, String currency) {
        this.amount = amount;
        this.currency = currency;
    }

    public static Dollar dollar(int amount) {
        return new Dollar(amount, Dollar.USD);
    }

    public static Franc franc(int amount) {
        return new Franc(amount, Franc.CHF);
    }

    public Money times(int multiplier) {
        return new Money(amount * multiplier, currency);
    }

    public String currency() {
        return currency;
    }

    @Override
    public boolean equals(Object object) {
        if (object == null) {
            return false;
        }
        Money money = (Money) object;
        return this.amount == money.amount && currency().equals(money.currency());
    }

    @Override
    public String toString() {
        return amount + " " + currency;
    }
}
