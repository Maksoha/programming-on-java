package org.example.prac_20.task2;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Stack;

public class CalculatorModel {
    private ArrayDeque<String> expressionStack;

    public CalculatorModel() {
        expressionStack = new ArrayDeque<>();
    }

    public double evaluateExpression(String expression) throws Exception {
        expressionStack.clear();
        String[] tokens = expression.split(" ");
        for (String token : tokens) {
            expressionStack.push(token);
        }
        return evaluateRPN(expressionStack);
    }

    private double evaluateRPN(ArrayDeque<String> tokens) throws Exception {
        Stack<Double> stack = new Stack<>();

        while (!tokens.isEmpty()) {
            String token = tokens.pollLast();
            if (isNumeric(token)) {
                stack.push(Double.parseDouble(token));
            } else {
                double operand2 = stack.pop();
                double operand1 = stack.pop();
                double result = performOperation(token, operand1, operand2);
                stack.push(result);
            }
        }

        if (stack.size() != 1) {
            throw new Exception("Invalid expression");
        }

        return stack.pop();
    }

    private boolean isNumeric(String str) {
        try {
            Double.parseDouble(str);
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    private double performOperation(String operator, double operand1, double operand2) {
        return switch (operator) {
            case "+" -> operand1 + operand2;
            case "-" -> operand1 - operand2;
            case "*" -> operand1 * operand2;
            case "/" -> {
                if (operand2 == 0) {
                    throw new ArithmeticException("Division by zero");
                }
                yield operand1 / operand2;
            }
            default -> throw new IllegalArgumentException("Invalid operator: " + operator);
        };
    }
}
