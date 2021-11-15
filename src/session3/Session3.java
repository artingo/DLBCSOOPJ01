package session3;

import java.util.Arrays;
import java.util.Collections;

public class Session3 {
    public static void main(String[] args) {
        sortArray();
        forEachLoop(null);
        twoDimensionalArray();
        compareArrays();
    }

    private static void compareArrays() {
        String[] arrayOne = oneDimensionalArray();
        String[] arrayTwo = oneDimensionalArray();
        Arrays.sort(arrayTwo);
        forEachLoop(arrayOne);
        forEachLoop(arrayTwo);
        System.out.println("Are the arrays equal? " + Arrays.equals(arrayOne, arrayTwo));
    }

    private static void sortArray() {
        String[] stringArray = oneDimensionalArray();
        Arrays.sort(stringArray);
        forEachLoop(stringArray);
    }

    private static void forEachLoop(String[] stringArray) {
        if (stringArray == null) {
            stringArray = oneDimensionalArray();
        }
        for(String currentString : stringArray) {
            System.out.print(currentString + " ");
        }
        System.out.println();
    }

    private static String[] oneDimensionalArray() {
        String[] myStringArray = {"Red", "green", "Blue", "yellow", "black"};
        return myStringArray;
    }

    private static void twoDimensionalArray() {
        int[][] board = new int[10][5];
        for (int row = 0; row < board.length; row++) {
            for (int col = 0; col < board[0].length; col++) {
                board[row][col] = col + 1;
            }
            System.out.println("row #" + (row + 1) + "\t" + Arrays.toString(board[row]));
        }
    }
}
