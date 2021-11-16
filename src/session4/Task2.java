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
        drawnNumbers = shuffle(numbersBet.length);

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

        return numbersDrawn;
    }
}
