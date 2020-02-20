package labs_examples.conditions_loops.labs;

import java.util.Scanner;

/**
 * Conditions and Loops Exercise 5: Calculator
 *
 *      Take two numbers from the user, an upper and lower bound. Using a "for-loop", calculate the sum
 *      of numbers from the lower bound to the upper bound. Also, calculate the average of numbers.
 *      Print the results to the console.
 *
 *      For example, if a user enters 1 and 100, the output should be:
 *
 *      The sum is: 5050
 *      The average is: 50.5
 *
 *
 */

public class Exercise_05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter two numbers (separated by a space) between 1 and 100 that are not very close to each other: ");
        int i = scanner.nextInt();
        int j = 0;
        if (scanner.hasNext()) {
            j = scanner.nextInt();
        }
//      how do I do the above iteratively (e.g. if I did not know how many inputs there are)? I have tried:
//          while(scanner.hasNext()) //does this need to be while(scanner.hasNextInt())
//          {
//              System.out.println(scanner.nextInt());
//          }
//      but the program keeps running indefinitely
        int num = i;
        int sum = i;
        while (num <= j-1) {
            num++;
            sum += num;
        }
        System.out.println("The sum is: " + sum);
        float ii = i;
        float jj = j;
        float av = (ii + jj)/2;
        System.out.println("The average is: " + av);
    }

}
