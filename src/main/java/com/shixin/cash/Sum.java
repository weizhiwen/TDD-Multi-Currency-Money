package com.shixin.cash;

public class Sum implements Expression {
    Money augend;

    Money addend;

    public Sum(Money augend, Money addend) {
        this.augend = augend;
        this.addend = addend;
    }

    @Override
    public Money reduce(Bank bank, String to) {
        return new Money(augend.amount + addend.amount, to);
    }
}
