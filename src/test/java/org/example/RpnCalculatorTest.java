package org.example;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

class RpnCalculatorTest {
    @Test
    public void should_return_2_equals_2() {
        var input = "2";
        var calculator = new RpnCalculator(input);

        assertEquals(2d, calculator.run());
    }

    @Test
    public void should_split_tokens() {
        var input = "20 2 +";
        var calculator = new RpnCalculator(input);

        var expectedTokens = List.of("20", "2", "+");
        assertEquals(expectedTokens, calculator.getTokens());
    }

    @Test
    public void when_20_plus_2_should_return_22() {
        var input = "20 2 +";
        var calculator = new RpnCalculator(input);

        assertEquals(22d, calculator.run());
    }

    @Test
    public void when_20_minus_2_should_return_22() {
        var input = "20 2 -";
        var calculator = new RpnCalculator(input);

        assertEquals(18d, calculator.run());
    }

    @Test
    public void when_complex_calculation_should_return_correct_result() {
        var input = "4 2 + 3 -";
        var calculator = new RpnCalculator(input);

        assertEquals(3d, calculator.run());
    }
}
