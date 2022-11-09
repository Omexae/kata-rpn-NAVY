package org.example;

import java.util.List;

/**
 * Hello world!
 *
 */
public class RpnCalculator
{
    private final String input;

    public RpnCalculator(String input) {
        this.input = input;
    }

    public int run() {
        return Integer.parseInt(this.input);
    }
}
