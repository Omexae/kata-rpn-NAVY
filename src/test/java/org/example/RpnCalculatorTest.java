package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * Unit test for simple App.
 */ class RpnCalculatorTest {
    @Test
    public void when_2_should_return_2() {
        var input = "2";
        var calculator = new RpnCalculator(input);

        assertEquals(2, calculator.run());
    }

}
