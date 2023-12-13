package PractWork_20.task2;

import PractWork_20.task1.RPNCalculator;

class CalculatorModel {
    private String input;

    public void setInput(String input) {
        this.input = input;
    }

    public double evaluate() {
        String[] tokens = input.split(" ");
        return RPNCalculator.evaluateRPN(tokens);
    }
}