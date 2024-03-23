package com.shixin.cash;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * $5 + 10CHF = $10 if rate is 2:1 <br>
 * <s>$5 * 2 = $10</s> <br>
 * <s>Make "amount" private</s> <br>
 * <s>Dollar side-effects?</s> <br>
 * Money rounding? <br>
 * <s>equals()</s> <br>
 * hashCode() <br>
 * Equal null <br>
 * Equal Object <br>
 * <s>5 CHF * 2 = 10 CHF</s> <br>
 * <s>Dollar/Franc duplications</s> <br>
 * <s>Common equals</s> <br>
 * <s>Common times</s> <br>
 * <s>Compare Francs with Dollars</s> <br>
 * <s>Currency?</s> <br>
 * <s>Delete testFrancMultiplication?</s> <br>
 */
class TestMultiCurrencyMoney {

    @Test
    void testMultiplication() {
        Money five = Money.dollar(5);
        assertEquals(Money.dollar(10), five.times(2));
        assertEquals(Money.dollar(15), five.times(3));
    }

    @Test
    void testEquality() {
        assertEquals(Money.dollar(5), Money.dollar(5));
        assertNotEquals(Money.dollar(5), Money.dollar(6));
        assertNotEquals(Money.franc(5), Money.dollar(5));
    }

    @Test
    void testCurrency() {
        assertEquals("USD", Money.dollar(1).currency());
        assertEquals("CHF", Money.franc(1).currency());
    }
}
