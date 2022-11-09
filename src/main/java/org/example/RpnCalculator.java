package org.example;

import java.util.*;

/**
 * Hello world!
 *
 */
public class RpnCalculator
{

    private final List<String> tokens;
    private final List<Double> stacks = new ArrayList<>();

    public RpnCalculator(String input) {
        this.tokens = new ArrayList<>(List.of(input.split(" ")));
    }

    public List<String> getTokens() {
        return Collections.unmodifiableList(tokens);
    }

    public Double doCalculation(String operator) {
        var result = stacks.stream().reduce(0d, (a, b) -> switch (operator) {
            case "+" -> a + b;
            case "-" -> a - b;
            case "*" -> a * b;
            case "/" -> a / b;
            default -> throw new IllegalArgumentException("Unknown operator");
        });
        this.stacks.clear();
        this.stacks.add(result);

        return result;
    }

    public Number run() {
        if (tokens.size() == 1) {
            return Double.parseDouble(tokens.get(0));
        }

        for (var token : tokens) {
            try {
                stacks.add(Double.parseDouble(token));
            } catch (NumberFormatException e) {
                return doCalculation(token);
            }
        }

        return null;
    }
}
