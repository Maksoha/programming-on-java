package org.example.prac_15.task3;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;

class CalculatorView {
    private JTextField inputField1;
    private JTextField inputField2;
    private JTextField resultField;
    private JButton calculateButton;

    public CalculatorView() {
        JFrame frame = new JFrame("Simple Calculator");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 150);

        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(4, 2));

        JLabel label1 = new JLabel("Number 1:");
        inputField1 = new JTextField();
        JLabel label2 = new JLabel("Number 2:");
        inputField2 = new JTextField();
        JLabel label3 = new JLabel("Result:");
        resultField = new JTextField();
        resultField.setEditable(false);
        calculateButton = new JButton("Calculate");

        panel.add(label1);
        panel.add(inputField1);
        panel.add(label2);
        panel.add(inputField2);
        panel.add(label3);
        panel.add(resultField);
        panel.add(new JLabel());
        panel.add(calculateButton);

        frame.add(panel);
        frame.setVisible(true);
    }

    public int getNum1() {
        return Integer.parseInt(inputField1.getText());
    }

    public int getNum2() {
        return Integer.parseInt(inputField2.getText());
    }

    public void setResult(int result) {
        resultField.setText(Integer.toString(result));
    }

    public void addCalculateListener(ActionListener listener) {
        calculateButton.addActionListener(listener);
    }
}
