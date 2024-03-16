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
        assertTrue(new Dollar(5).equals(new Dollar(5)));
        assertFalse(new Dollar(5).equals(new Dollar(6)));
    }
}
