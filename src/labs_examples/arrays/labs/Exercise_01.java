package labs_examples.arrays.labs;

import java.util.Scanner;

/**
 * Arrays calculator
 *
 *      Take in 10 numbers from the user. Place the numbers in an array. Using the loop of your choice,
 *      calculate the sum of all of the numbers in the array as well as the average.
 *
 *      Print the results to the console.
 *
 */

public class Exercise_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter 10 numbers between 1 and 100, separated by a space: ");
        String numsStrInput = scanner.next();
//        String numsStrInput = "1 17 19 44 56 78 88 67 99 45";
//        it works when I have this line but not when I use the scanner
        String[] nums = numsStrInput.split(" ");
        int sum = 0;
        for (String numsStr : nums) {
            int numsInt = Integer.valueOf(numsStr);
            sum += numsInt;
        }
        System.out.println(sum);

    }

}