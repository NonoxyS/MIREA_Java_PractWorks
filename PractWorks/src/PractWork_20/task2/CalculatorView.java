package PractWork_20.task2;

import javax.swing.*;
import java.awt.*;


public class CalculatorView extends JFrame {
    private JTextField inputField;
    private JTextField displayField;
    private CalculatorController controller;
    private JPanel buttonPanel;

    public CalculatorView() {
        setTitle("RPN Calculator");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());

        inputField = new JTextField(25);
        inputField.setEditable(true);
        add(inputField, BorderLayout.NORTH);

        displayField = new JTextField(25);
        displayField.setEditable(false);
        add(displayField, BorderLayout.CENTER);

        buttonPanel = new JPanel(new GridBagLayout());

        GridBagConstraints gbc = new GridBagConstraints();
        gbc.fill = GridBagConstraints.BOTH;
        gbc.weightx = 1.0;
        gbc.weighty = 1.0;

        String[] buttonLabels = {
                "7", "8", "9", "/",
                "4", "5", "6", "*",
                "1", "2", "3", "-",
                "C", "0", "=", "+"
        };

        int gridx = 0;
        int gridy = 0;
        for (String label : buttonLabels) {
            JButton button = new JButton(label);
            gbc.gridx = gridx;
            gbc.gridy = gridy;
            buttonPanel.add(button, gbc);
            button.addActionListener(controller);
            gridx++;
            if (gridx > 3) {
                gridx = 0;
                gridy++;
            }
        }

        gbc.gridx = 0;
        gbc.gridy = gridy + 1;
        gbc.gridwidth = 4;

        JButton spaceButton = new JButton(" ");
        buttonPanel.add(spaceButton, gbc);
        spaceButton.addActionListener(controller);

        add(buttonPanel, BorderLayout.SOUTH);
        initializeButtons();
        pack();
        setLocationRelativeTo(null);
    }

    public void initializeButtons() {
        if (controller != null) {
            for (Component comp : buttonPanel.getComponents()) {
                if (comp instanceof JButton) {
                    ((JButton) comp).addActionListener(controller);
                }
            }
        }
    }

    public void setController(CalculatorController controller) {
        this.controller = controller;
        initializeButtons();
    }

    public void setInputText(String s) {
        inputField.setText(s);
    }

    public void setDisplayText(String s) {
        displayField.setText(s);
    }

    public String getInputText() {
        return inputField.getText();
    }
}