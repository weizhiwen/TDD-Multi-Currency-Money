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
 * Dollar/Franc duplications <br>
 * <s>Common equals</s> <br>
 * Common times <br>
 * <s>Compare Francs with Dollars</s> <br>
 */
class TestMultiCurrencyMoney {

    @Test
    void testMultiplication() {
        Dollar five = new Dollar(5);
        assertEquals(new Dollar(10), five.times(2));
        assertEquals(new Dollar(15), five.times(3));
    }

    @Test
    void testEquality() {
        assertEquals(new Dollar(5), new Dollar(5));
        assertNotEquals(new Dollar(5), new Dollar(6));
        assertEquals(new Franc(5), new Franc(5));
        assertNotEquals(new Franc(5), new Franc(6));
        assertNotEquals(new Franc(5), new Dollar(5));
    }

    @Test
    void testFrancMultiplication() {
        Franc five = new Franc(5);
        assertEquals(new Franc(10), five.times(2));
        assertEquals(new Franc(15), five.times(3));
    }
}
