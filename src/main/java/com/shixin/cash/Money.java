package com.shixin.cash;

public class Money implements Expression {
    public static final String CHF = "CHF";
    public static final String USD = "USD";

    protected int amount;
    protected String currency;

    public Money(int amount, String currency) {
        this.amount = amount;
        this.currency = currency;
    }

    public static Money dollar(int amount) {
        return new Money(amount, Money.USD);
    }

    public static Money franc(int amount) {
        return new Money(amount, Money.CHF);
    }

    public Expression times(int multiplier) {
        return new Money(amount * multiplier, currency);
    }


    @Override
    public Expression plus(Expression money) {
        return new Sum(this, money);
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

    @Override
    public Money reduce(Bank bank, String to) {
        int rate = bank.rate(currency, to);
        return new Money(amount / rate, to);
    }
}
