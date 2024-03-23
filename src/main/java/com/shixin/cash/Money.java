package com.shixin.cash;

public abstract class Money {
    public static final String CHF = "CHF";
    public static final String USD = "USD";

    protected int amount;
    protected String currency;

    protected Money(int amount, String currency) {
        this.amount = amount;
        this.currency = currency;
    }

    public static Dollar dollar(int amount) {
        return new Dollar(amount, Dollar.USD);
    }

    public static Franc franc(int amount) {
        return new Franc(amount, Franc.CHF);
    }

    abstract Money times(int multiplier);

    public String currency() {
        return currency;
    }

    @Override
    public boolean equals(Object object) {
        if (object == null) {
            return false;
        }
        Money money = (Money) object;
        return this.amount == money.amount && getClass().equals(money.getClass());
    }
}
