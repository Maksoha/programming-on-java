package org.example.prac_15.task3;

class CalculatorModel {
    private int num1;
    private int num2;
    private int result;

    public void setNumbers(int num1, int num2) {
        this.num1 = num1;
        this.num2 = num2;
    }

    public int calculate() {
        result = num1 + num2;
        return result;
    }
}
