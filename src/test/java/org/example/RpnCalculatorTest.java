package org.example;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

class RpnCalculatorTest {
    @Test
    public void should_return_2_equals_2() {
        var input = "2";
        var calculator = new RpnCalculator(input);

        assertEquals(2, calculator.run());
    }

    @Test
    public void should_split_tokens() {
        var input = "20 2 +";
        var calculator = new RpnCalculator(input);

        var expectedTokens = List.of("20", "2", "+");
        assertEquals(expectedTokens, calculator.getTokens());
    }

    @Test
    public void should_return_2_plus_2_equals_4(){
        var input = "2 2 +";
        var calculator = new RpnCalculator(input);

        // TODO
    }
}
