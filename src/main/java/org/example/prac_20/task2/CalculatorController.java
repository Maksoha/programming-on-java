package org.example.prac_20.task2;

import org.example.prac_20.task2.CalculatorModel;
import org.example.prac_20.task2.CalculatorView;

import javax.swing.*;

class CalculatorController {
    private static CalculatorModel model;
    private static CalculatorView view;

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            model = new CalculatorModel();
            view = new CalculatorView();
        });
    }

    public static void calculate() {
        try {
            String input = view.getInput();
            double result = model.evaluateExpression(input);
            view.setResult("Result: " + result);
        } catch (Exception e) {
            view.setResult("Error: " + e.getMessage());
        }
        view.clearInput();
    }

    public static void appendInput(String input) {
        String currentInput = view.getInput();
        view.setInput(currentInput + input);
    }
}