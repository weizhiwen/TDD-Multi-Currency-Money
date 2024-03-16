package com.shixin.cash;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * $5 + 10CHF = $10 if rate is 2:1 <br>
 * <s>$5 * 2 = $10</s> <br>
 * Make "amount" private <br>
 * <s>Dollar side-effects?</s> <br>
 * Money rounding <br>
 */
class TestMultiCurrencyMoney {

    @Test
    void testMultiplication() {
        Dollar five = new Dollar(5);
        Dollar product = five.times(2);
        assertEquals(10, product.amount);
        product = five.times(3);
        assertEquals(15, product.amount);
    }
}
