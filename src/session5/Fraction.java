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

    public static Fraction inputFraction(Scanner scanner) {
        // write your code here

        return null;
    }

    public Fraction addFractions(Fraction first, Fraction second) {
        // write your code here
        return null;
    }

    public Fraction subtractFractions(Fraction first, Fraction second) {
        // write your code here
        return null;
    }

    public Fraction multiplyFractions(Fraction first, Fraction second) {
        // write your code here
        return null;
    }

    public Fraction divideFractions(Fraction first, Fraction second) {
        // write your code here
        return null;
    }

    @Override
    public String toString() {
        return numerator + "/" + denominator;
    }
}
