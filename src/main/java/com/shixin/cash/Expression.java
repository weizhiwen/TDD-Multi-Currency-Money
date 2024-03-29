package com.shixin.cash;

public interface Expression {
    Money reduce(Bank bank, String to);
}
