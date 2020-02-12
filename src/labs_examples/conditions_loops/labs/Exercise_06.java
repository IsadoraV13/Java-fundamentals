package labs_examples.conditions_loops.labs;

/**
 * Conditions and Loops Exercise 6: Basic while loop
 *
 *      Use a "while" loop find the sum of numbers to from 1-100. Print the sum to the console
 *
 */

public class Exercise_06 {
    public static void main(String[] args) {
        int i = 0;
        int sum = i; //does the sum always need to start with i?
        while (i <= 99) { //does the max always need to be the upper bound minus 1?
            i++;
            sum += i;
        }
        System.out.println(sum);
    }
}
