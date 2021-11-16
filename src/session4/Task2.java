package session4;

import java.util.Arrays;
import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

/**
 * Write a program that allows users to bet in a lottery game (6 of 49).
 * The program should then randomly draw numbers and count how many draws were required to get a 6er.
 *
 * Change the {@link session3.Task2 code}  for the lottery game of session 3,
 * so that it uses two methods 'shuffle' and 'draw',
 * which can work with arrays of any size.
 */
public class Task2 {
    public static void main(String[] args) {
        final int WINNING_NUMBERS = 6;
        int[] betNumbers = new int[WINNING_NUMBERS];
        Scanner scanner = new Scanner(System.in);

        // get <WINNING_NUMBERS> numbers from the user
        // write your code from here
        for (int i = 0; i < betNumbers.length; i++) {
            betNumbers[i] = scanNumber(betNumbers, scanner);
        }
        System.out.println("Calculating...");
        // until here ----------------
        scanner.close();
        Arrays.sort(betNumbers);

        // start the lottery draw
        Task2 instance = new Task2();
        int nrOfDraws = instance.draw(betNumbers);
        System.out.println("Nr of draws necessary = " + String.format("%,d", nrOfDraws));
    }

    /**
     * Repeats drawing random numbers until they are the same as the numbers bet
     * @param numbersBet as int[] - an array containing the numbers bet
     * @return nrOfDraws as int - the number of draws to win
     */
    private int draw(int[] numbersBet) {
        int nrOfDraws = 0;
        int[] drawnNumbers;

        // write your code here, using a 'do-while' loop
        do {
            // generate random numbers
            nrOfDraws++;
            drawnNumbers = shuffle(numbersBet.length);
        }
        while (Arrays.equals(numbersBet, drawnNumbers) == false);

        System.out.println("drawnNumbers = " + Arrays.toString(drawnNumbers));
        return nrOfDraws;
    }

    /**
     * Generates <size> random, unique numbers between 1 and 49
     * @param size as int - number of numbers to create
     * @return numbersDrawn as int[] - the generated random numbers
     */
    private int[] shuffle(int size) {
        int[] numbersDrawn = new int[size];
        // write your code here
        numbersDrawn = ThreadLocalRandom
                .current()
                .ints(1, 49 + 1)
                .limit(size)
                .distinct()
                .sorted()
                .toArray();
        return numbersDrawn;
    }

    /**
     * Repeats scanning a number until it is valid
     * @param numbers as int[] - number array to fill
     * @param scan as Scanner - scanner passed by main method
     * @return newNumber as int - a valid number
     */
    private static int scanNumber(int[] numbers, Scanner scan) {
        int newNumber;
        boolean isNumberValid;
        do {
            System.out.print("Please enter a bet number between 1 and 49: ");
            newNumber = scan.nextInt();
            isNumberValid = checkNumber(numbers, newNumber);
        } while (isNumberValid == false);
        return newNumber;
    }

    /**
     * Checks if the new number is between 1 and 49
     * Checks if the new number already exists in the numbers array
     * @param numbers as int[] - number array to fill
     * @param newNumber as int - a new number to check
     * @return isValidNumber as boolean - true if the number passed the checks
     */
    private static boolean checkNumber(int[] numbers, int newNumber) {
        if (newNumber < 1 || newNumber > 49) {
            System.out.println("Only numbers between 1 and 49!");
            return false;
        }
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] == newNumber) {
                System.out.println("This number already exists!");
                return false;
            }
        }
        return true;
    }
}
