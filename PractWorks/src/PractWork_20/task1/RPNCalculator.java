package PractWork_20.task1;

import java.util.Stack;

public class RPNCalculator {
    public static double evaluateRPN(String[] tokens) {
        Stack<Double> stack = new Stack<>();

        for (String token : tokens) {
            if (token.matches("-?\\d+(\\.\\d+)?")) {
                stack.push(Double.parseDouble(token));
            }
            else {
                double operand2 = stack.pop();
                double operand1 = stack.pop();
                switch (token) {
                    case "+":
                        stack.push(operand1 + operand2);
                        break;
                    case "-":
                        stack.push(operand1 - operand2);
                        break;
                    case "*":
                        stack.push(operand1 * operand2);
                        break;
                    case "/":
                        stack.push(operand1 / operand2);
                        break;
                }
            }
        }
        return stack.pop();
    }
    public static void main(String[] args) {
        String input = "8 2 5 * + 1 3 2 * + 4 - /";

        double result = evaluateRPN(input.split(" "));
        System.out.println("Результат: " + result);
    }
}