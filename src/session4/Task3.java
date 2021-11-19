package session4;

import java.util.Scanner;

/**
 * Write a program that calculates fractions (e.g. a/b where a and b are both integers).
 * The program should ask for two fractions (by asking for numerator and denominator)
 * and then apply all four basic arithmetic operations to the two fractions.
 * Use methods for the calculations.
 *
 * Addition of fractions:
 * a/b + c/d = (a*d + b*c) / (b*d)
 *
 * Subtraction of fractions:
 * a/b − c/d = (a*d − b*c) / (b*d)
 *
 * Multiplication of fractions:
 * a/b * c/d = (a*c) / (b*d)
 *
 * Division of fractions:
 * a/b / c/d = (a*d) / (b*c)
 */
public class Task3 {
    public static void main(String[] args) {
        Task3 instance = new Task3();
        Scanner scanner = new Scanner(System.in);

        // get 4 numbers from the user, i.e. 2 fractions
        // write your code from here
        Fraction a = instance.inputFraction(scanner);
        Fraction b = instance.inputFraction(scanner);
        // until here --------------
        scanner.close();

        Fraction additionResult = instance.addFractions(a, b);
        System.out.println("additionResult = " + additionResult);

        Fraction subtractionResult = instance.subtractFractions(a, b);
        System.out.println("subtractionResult = " + subtractionResult);

        Fraction multiplicationResult = instance.multiplyFractions(a, b);
        System.out.println("multiplicationResult = " + multiplicationResult);

        Fraction divisionResult = instance.divideFractions(a, b);
        System.out.println("divisionResult = " + divisionResult);
    }

    /**
     * Scans 2 integers and returns the corresponding fraction
     *
     * @param scanner as Scanner
     * @return fraction as Fraction
     */
    private Fraction inputFraction(Scanner scanner) {
        // write your code here

        return new Fraction(1, 2);
    }

    /**
     * Adds two fractions and returns the result as fraction
     *
     * @param first  as Fraction - the first fraction
     * @param second as Fraction - the second fraction
     * @return result as Fraction
     */
    private Fraction addFractions(Fraction first, Fraction second) {
        // write your code here
        Fraction result = new Fraction(1, 3);
        return result;
    }

    /**
     * Subtracts two fractions and returns the result as fraction
     *
     * @param first  as Fraction - the first fraction
     * @param second as Fraction - the second fraction
     * @return result as Fraction
     */
    private Fraction subtractFractions(Fraction first, Fraction second) {
        // write your code here
        Fraction result = new Fraction(2, 3);
        return result;
    }

    /**
     * Multiplies two fractions and returns the result as fraction
     *
     * @param first  as Fraction - the first fraction
     * @param second as Fraction - the second fraction
     * @return result as Fraction
     */
    private Fraction multiplyFractions(Fraction first, Fraction second) {
        // write your code here
        Fraction result = new Fraction(3, 3);
        return result;
    }

    /**
     * Divides two fractions and returns the result as fraction
     *
     * @param first  as Fraction - the first fraction
     * @param second as Fraction - the second fraction
     * @return result as Fraction
     */
    private Fraction divideFractions(Fraction first, Fraction second) {
        // write your code here
        Fraction result = new Fraction(4, 3);
        return result;
    }

    /**
     * Private class for fractions
     */
    private class Fraction {
        public int numerator;
        public int denominator;

        public Fraction(int numerator, int denominator) {
            this.numerator = numerator;
            this.denominator = denominator;
        }

        @Override
        public String toString() {
            return numerator + "/" + denominator;
        }
    }
}
