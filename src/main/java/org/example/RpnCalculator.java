package org.example;

import java.util.*;

/**
 * Hello world!
 *
 */
public class RpnCalculator
{

    private List<String> tokens;

    public RpnCalculator(String input) {
        this.tokens = new ArrayList<>(List.of(input.split(" ")));
    }

    public List<String> getTokens() {
        return Collections.unmodifiableList(tokens);
    }

    public int run() {
        return 2;
    }
}
