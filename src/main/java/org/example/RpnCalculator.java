package org.example;

import java.util.*;

/**
 * Hello world!
 */
public class RpnCalculator {

    private final List<String> tokens;
    private final List<Double> stacks = new ArrayList<>();

    public RpnCalculator(String input) {
        this.tokens = new ArrayList<>(List.of(input.split(" ")));
    }

    public List<String> getTokens() {
        return Collections.unmodifiableList(tokens);
    }

    public void doCalculation(String operator) {
        var a = this.stacks.remove(0);
        var b = this.stacks.remove(0);

        var result = switch (operator) {
            case "+" -> a + b;
            case "-" -> a - b;
            case "*" -> a * b;
            case "/" -> b / a;
            default -> throw new IllegalArgumentException("Unknown operator");
        };

        this.stacks.clear();
        this.stacks.add(result);
    }

    public Number run() {
        if (tokens.size() == 1) {
            return Double.parseDouble(tokens.get(0));
        }

        for (var token : tokens) {
            try {
                stacks.add(Double.parseDouble(token));
            } catch (NumberFormatException e) {
                doCalculation(token);
            }
        }

        return stacks.get(0);
    }
}
