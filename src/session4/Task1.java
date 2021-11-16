package session4;

import java.util.Arrays;

/**
 * Change the program of the exercise with the card game from the previous session in a way
 * that two methods are used to find the minimum and maximum.
 */
public class Task1 {
    public static void main(String[] args) {
        int[] integerArray = {45, 7, 88, 102, 1, 3, 50};
        Task1 instance = new Task1();

        System.out.println("integerArray = " + Arrays.toString(integerArray));
        int smallest = instance.findSmallestNumber(integerArray);
        System.out.println("smallest number = " + smallest);

        int biggest = instance.findBiggestNumber(integerArray);
        System.out.println("biggest number = " + biggest);
    }

    /**
     * Finds the smallest number in an array
     * @param values as int[] - the array to check
     * @return smallest as int - the smallest number in the array
     */
    private int findSmallestNumber(int[] values) {
        // write your code here

        return 0;
    }

    /**
     * Find the biggest number in an array
     * @param values as int[] - the array to check
     * @return biggest as int - the biggest number in the array
     */
    private int findBiggestNumber(int[] values) {
        // write your code here

        return 0;
    }
}
