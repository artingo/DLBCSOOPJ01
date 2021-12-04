package session5;

import java.util.Scanner;

/**
 * Write a program that calculates with fractions (e.g. a/b where a and b are both integers).
 * The program should ask for two fractions (by asking for numerator and denominator)
 * and then apply all four basic arithmetic operations to the two fractions.
 * Use methods for the calculations.
 *
 * Addition of fractions:       a/b + c/d = (a*d + b*c) / (b*d)
 * Subtraction of fractions:    a/b − c/d = (a*d − b*c) / (b*d)
 * Multiplication of fractions: a/b * c/d = (a*c) / (b*d)
 * Division of fractions:       a/b / c/d = (a*d) / (b*c)
 */
public class Fraction {
    private int numerator;
    private int denominator;

    public Fraction(int numerator, int denominator) {
        this.numerator = numerator;
        this.denominator = denominator;
    }

    /**
     * Lets the user input the numerator and demnominator of a fraction
     * @param scanner as Scanner
     * @return newFraction as Fraction
     */
    public static Fraction inputFraction(Scanner scanner) {
        // write your code here
        System.out.print("Please input the numerator: ");
        int numerator = scanner.nextInt();
        System.out.print("Please input the denominator: ");
        int denominator = scanner.nextInt();
        Fraction newFraction = new Fraction(numerator, denominator);
        return newFraction;
    }

    /**
     * Adds two fractions
     * @param first as Fraction
     * @param second as Fraction
     * @return result as Fraction
     */
    public Fraction addFractions(Fraction first, Fraction second) {
        // (a*d + b*c) / (b*d)
        // write your code here
        int a = first.numerator,  b = first.denominator;
        int c = second.numerator, d = second.denominator;
        int resultNumerator = a*d + b*c;
        int resultDenominator = b*d;
        return new Fraction(resultNumerator, resultDenominator);
    }

    /**
     * Subtracts the second fraction from the first fraction
     * @param first as Fraction
     * @param second as Fraction
     * @return result as Fraction
     */
    public Fraction subtractFractions(Fraction first, Fraction second) {
        // (a*d - b*c) / (b*d)
        // write your code here
        int a = first.numerator,  b = first.denominator;
        int c = second.numerator, d = second.denominator;
        int resultNumerator = a*d - b*c;
        int resultDenominator = b*d;
        return new Fraction(resultNumerator, resultDenominator);
    }

    /**
     * Multiplies two fractions
     * @param first as Fraction
     * @param second as Fraction
     * @return result as Fraction
     */
    public Fraction multiplyFractions(Fraction first, Fraction second) {
        // (a*c) / (b*d)
        // write your code here
        int a = first.numerator,  b = first.denominator;
        int c = second.numerator, d = second.denominator;
        int resultNumerator = a*c;
        int resultDenominator = b*d;
        return new Fraction(resultNumerator, resultDenominator);
    }

    /**
     * Divides the first fraction by the second fraction
     * @param first as Fraction
     * @param second as Fraction
     * @return result as Fraction
     */
    public Fraction divideFractions(Fraction first, Fraction second) {
        // (a*d) / (b*c)
        // write your code here
        int a = first.numerator,  b = first.denominator;
        int c = second.numerator, d = second.denominator;
        int resultNumerator = a*d;
        int resultDenominator = b*c;
        return new Fraction(resultNumerator, resultDenominator);
    }

    public int getNumerator() {
        return numerator;
    }

    public void setNumerator(int numerator) {
        this.numerator = numerator;
    }

    public int getDenominator() {
        return denominator;
    }

    public void setDenominator(int denominator) {
        this.denominator = denominator;
    }

    /**
     * Outputs the fraction in the form <numerator>/<denominator>
     * @return this fraction as String
     */
    @Override
    public String toString() {
        return numerator + "/" + denominator;
    }
}
