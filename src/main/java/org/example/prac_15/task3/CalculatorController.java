package org.example.prac_15.task3;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class CalculatorController {
    private CalculatorModel model;
    private CalculatorView view;

    public CalculatorController(CalculatorModel model, CalculatorView view) {
        this.model = model;
        this.view = view;
        view.addCalculateListener(new CalculateListener());
    }

    class CalculateListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            int num1 = view.getNum1();
            int num2 = view.getNum2();
            model.setNumbers(num1, num2);
            int result = model.calculate();
            view.setResult(result);
        }
    }
}
