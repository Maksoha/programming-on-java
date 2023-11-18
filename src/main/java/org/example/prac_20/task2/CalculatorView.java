package org.example.prac_20.task2;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class CalculatorView {
    private JFrame frame;
    private JTextField inputField;
    private JLabel resultLabel;

    public CalculatorView() {
        frame = new JFrame("RPN Calculator");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 400);

        inputField = new JTextField();
        inputField.setPreferredSize(new Dimension(280, 50));

        resultLabel = new JLabel();
        resultLabel.setPreferredSize(new Dimension(280, 50));

        JPanel buttonPanel = new JPanel(new GridLayout(5, 4));

        String[] buttonLabels = {
                "7", "8", "9", "+",
                "4", "5", "6", "-",
                "1", "2", "3", "*",
                "0", ".", "=", "/"
        };

        for (String label : buttonLabels) {
            JButton button = new JButton(label);
            button.addActionListener(new ButtonClickListener());
            buttonPanel.add(button);
        }

        frame.setLayout(new FlowLayout());
        frame.add(inputField);
        frame.add(resultLabel);
        frame.add(buttonPanel);
        frame.setVisible(true);
    }

    public String getInput() {
        return inputField.getText();
    }

    public void setInput(String input) {
        inputField.setText(input + " ");
    }

    public void setResult(String result) {
        resultLabel.setText(result);
    }

    public void clearInput() {
        inputField.setText("");
    }

    private class ButtonClickListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            String command = e.getActionCommand();
            if (command.equals("=")) {
                CalculatorController.calculate();
            } else {
                CalculatorController.appendInput(command);
            }
        }
    }
}