package labs_examples.exception_handling.labs;

import java.util.Scanner;

/**
 * Exception Handling Exercise 1:
 *
 *      1) Demonstrate a try/catch.
 *
 */

public class Exercise_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter a number to perform the calculation: ");
        int userInput = scanner.nextInt();
        calculation(userInput);
    }

    public static void calculation(int b) {
        try {
            System.out.println((2 + b) / b);
        } catch (ArithmeticException exc) {
            System.out.println("Sorry, int b cannot be zero, please choose another value next time.");
        }
    }

}

