package PractWork_20.task2;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class CalculatorController implements ActionListener {
    private CalculatorModel model;
    private CalculatorView view;
    private String currentInput = "";

    public CalculatorController(CalculatorModel model, CalculatorView view) {
        this.model = model;
        this.view = view;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String command = e.getActionCommand();

        switch (command) {
            case "C":
                currentInput = "";
                view.setInputText("");
                view.setDisplayText("");
                break;
            case "=":
                model.setInput(currentInput);

                try {
                    double result = model.evaluate();
                    if (Double.isInfinite(result)) {
                        throw new ArithmeticException("Divide by zero");
                    }
                    view.setDisplayText(String.valueOf(result));
                } catch (ArithmeticException ex) {
                    view.setDisplayText(ex.getMessage());
                } catch (Exception ex) {
                    view.setDisplayText("Error");
                }

                currentInput = "";
                break;
            case "+":
            case "-":
            case "*":
            case "/":
                if ((view.getInputText().substring(view.getInputText().length() - 1)).equals(" ")) {
                    currentInput += command + " ";
                    view.setInputText(currentInput);
                    break;
                }
                else {
                    currentInput += " " + command + " ";
                    view.setInputText(currentInput);
                    break;
                }
            default:
                currentInput += command;
                view.setInputText(currentInput);
                break;
        }
    }
}