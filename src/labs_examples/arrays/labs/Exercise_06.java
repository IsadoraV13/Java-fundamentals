package labs_examples.arrays.labs;

import java.util.Arrays;

/**
 *  Reversing an array in place
 *
 *
 *      This is a very common interview challenge.
 *
 *      Using a for loop, please demonstrate how to reverse an array in place using only one extra variable. Please note,
 *      you cannot use a second array and you can only instantiate one variable outside of the for loop.
 *
 */
public class Exercise_06 {
    public static void main(String[] args) {
        int array [] = {78, 25, 34, 42, 577, 9};
        for (int j = 0; j < array.length/2; j++) {
        int memory = array[j];
        array[j] = array[array.length-1-j];
        array[array.length-1-j] = memory;
        System.out.println("//Step " + (j+1) + ": " + Arrays.toString(array));
        }
        System.out.println("Final reversed array: " + Arrays.toString(array));
    }
}


// tips: don't count backwards
// swap values at indexes, but don't lose the original value: use the extra variable