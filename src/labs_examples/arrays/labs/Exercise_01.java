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
        String[] nums = new String [10]; //= numsStrInput.split(" ")
        System.out.println(numsStrInput.split(" "));
        for (String numsStr : nums) {
            for (int j = 0; j < nums.length; j++) {
                numsStr = nums [j];
                j++;
            }

        }
        System.out.println(nums[1]);
        for (int i = 0; i < nums.length; i++) {
            int numsInt = Integer.valueOf(nums[i]);
            int sum = 0;
            while (i < nums.length) {
                sum += numsInt;

            }
            System.out.println(sum);
        }

    }

}