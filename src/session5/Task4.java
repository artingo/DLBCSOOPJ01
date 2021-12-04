package session5;

/**
 * Use the code from transfer task 2 in this session which is used to do basic arithmetic operations with fractions.
 * Add getters and setters for the attributes of the fraction.
 */
public class Task4 {
    public static void main(String[] args) {
        // make this code run
         Fraction fraction = new Fraction(1, 2);
         System.out.println("numerator = " + fraction.getNumerator());
         System.out.println("denominator = " + fraction.getDenominator());

         Fraction second = new Fraction(1, 2);
         Fraction additionResult = fraction.addFractions(fraction, second);
         System.out.println(fraction + " + " + second + " = " + additionResult);

        Fraction subtractionResult = fraction.subtractFractions(fraction, second);
        System.out.println(fraction + " - " + second + " = " + subtractionResult);

        Fraction multiplicationResult = fraction.multiplyFractions(fraction, second);
        System.out.println(fraction + " * " + second + " = " + multiplicationResult);

        Fraction divisionResult = fraction.divideFractions(fraction, second);
        System.out.println(fraction + " / " + second + " = " + divisionResult);
    }
}
