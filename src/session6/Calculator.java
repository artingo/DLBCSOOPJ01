package session6;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * This class represents a simple calculator that works with integers
 */
public class Calculator extends JFrame implements ActionListener {
    private JTextField display;
    private Integer firstNumber;
    private Integer secondNumber;
    private String operator;

    /**
     * Initializes buttons & text fields and shows the Calculator
     */
    public void start() {
        JFrame window = new JFrame("Calculator");
        JPanel panel = new JPanel();
        try {
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        } catch (Exception e) {
            System.err.println(e.getMessage());
        }

        display = new JTextField(18);
        display.setEditable(false);
        panel.add(display);

        JButton[] buttons = new JButton[10];
        for (int i = 0; i < buttons.length; i++) {
            buttons[i] = new JButton("" + i);
            buttons[i].addActionListener(this);
        }

        // 1st row
        panel.add(buttons[7]);
        panel.add(buttons[8]);
        panel.add(buttons[9]);
        JButton divisionButton = new JButton("/");
        divisionButton.addActionListener(this);
        panel.add(divisionButton);

        // 2nd row
        panel.add(buttons[4]);
        panel.add(buttons[5]);
        panel.add(buttons[6]);
        JButton multiplyButton = new JButton("*");
        multiplyButton.addActionListener(this);
        panel.add(multiplyButton);

        // 3rd row
        panel.add(buttons[1]);
        panel.add(buttons[2]);
        panel.add(buttons[3]);
        JButton minusButton = new JButton("-");
        minusButton.addActionListener(this);
        panel.add(minusButton);

        // 4th row
        JButton cButton = new JButton("C");
        cButton.addActionListener(this);
        panel.add(cButton);

        panel.add(buttons[0]);

        JButton equalsButton = new JButton("=");
        equalsButton.addActionListener(this);
        panel.add(equalsButton);

        JButton plusButton = new JButton("+");
        plusButton.addActionListener(this);
        panel.add(plusButton);

        // 5th row
        panel.add(new JLabel("num"));
        JTextField numeratorField = new JTextField(2);
        panel.add(numeratorField);
        panel.add(new JLabel("denom"));
        JTextField denominatorField = new JTextField(2);
        panel.add(denominatorField);
        JButton fractionButton = new JButton("frac");
        fractionButton.addActionListener(this);
        panel.add(fractionButton);

        window.add(panel);
        window.setSize(200, 220);
        window.setResizable(false);
        window.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        window.show();
    }

    /**
     * Handles all button clicks
     * @param event as ActionEvent
     */
    @Override
    public void actionPerformed(ActionEvent event) {
        // this represents the button label
        String command = event.getActionCommand();
        switch (command) {
            case "frac":
                // write your code here
                display.setText("Implement fractions...");
                break;

            case "C":
                reset();
                break;

            case "/":
            case "*":
            case "-":
            case "+":
                operation(command);
                break;

            case "=":
                calculate();
                break;

            default:
                display.setText(display.getText() + command);
        }
    }

    /**
     * Clears the display and the variables
     */
    private void reset() {
        display.setText("");
        operator = null;
        firstNumber = null;
        secondNumber = null;
    }

    /**
     * Parses the first number and operator
     * Displays a message on the display, if an error occurs
     * @param command as String
     */
    private void operation(String command) {
        try {
            firstNumber = Integer.parseInt(display.getText());
        } catch (NumberFormatException e) {
            display.setText("Number too big");
            return;
        }
        operator = command;
        display.setText(display.getText() + command);
    }

    /**
     * Executes the operation, calculates and displays the result
     * Displays a message on the display, if an error occurs
     */
    private void calculate() {
        int indexOfOperator = display.getText().indexOf(operator);
        String second = display.getText().substring(indexOfOperator + 1);
        secondNumber = Integer.parseInt(second);

        Integer result = null;
        switch (operator) {
            case "+":
                result = addition(firstNumber, secondNumber);
                break;

            case "-":
                result = subtraction(firstNumber, secondNumber);
                break;

            case "*":
                result = multiplication(firstNumber, secondNumber);
                break;

            case "/":
                try {
                    result = division(firstNumber, secondNumber);
                } catch (Exception e) {
                    display.setText("Division by Zero");
                    return;
                }
        }
        display.setText("" + result);
    }

    /**
     * Adds to numbers
     * @param first as int
     * @param second as int
     * @return result as int
     */
    private int addition(int first, int second) {
        // re-write this code to use fractions
        return first + second;
    }

    /**
     * Subtracts the second from the first number
     * @param first as int
     * @param second as int
     * @return result as int
     */
    private int subtraction(int first, int second) {
        // re-write this code to use fractions
        return first - second;
    }

    /**
     * Multiplies the first with the second number
     * @param first as int
     * @param second as int
     * @return result as int
     */
    private int multiplication(int first, int second) {
        // re-write this code to use fractions
        return first * second;
    }

    /**
     * Divides the first by the second number.
     * @param first as int
     * @param second as int
     * @return result as int
     */
    private int division(int first, int second) {
        // re-write this code to use fractions
        return first / second;
    }
}
