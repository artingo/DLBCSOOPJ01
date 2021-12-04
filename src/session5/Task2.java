package session5;

import java.util.Scanner;

/**
 * Use the code from the previous session that calculated basic arithmetic operations with two fractions.
 * Write a class for handling such fractions.
 * Change the methods for the arithmetic operations so that they are using this class.
 * Write another class that executes the calculations. It should ask for two fractions
 * and an arithmetic operation and then calculate and display the result.
 */
public class Task2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 1. complete the Fraction class
        // 2. input 2 fractions and an arithmetic operation
        // 3. do the selected calculation and output the result
        // write your code here
        Fraction first = Fraction.inputFraction(scanner);

        System.out.println("Please choose an operation:");
        System.out.println("Type '+' for addition");
        System.out.println("Type '-' for subtraction");
        System.out.println("Type '*' for multiplication");
        System.out.println("Type '/' for division");
        String operation = scanner.next();

        Fraction second = Fraction.inputFraction(scanner);

        Fraction result = null;
        switch(operation) {
            case "+":
                result = first.addFractions(first, second);
                break;
            case "-":
                result = first.subtractFractions(first, second);
                break;
            case "*":
                result = first.multiplyFractions(first, second);
                break;
            case "/":
                result = first.divideFractions(first, second);
        }
        System.out.println("result = " + result);

        scanner.close();
    }
}
