package labs_examples.exception_handling.labs;

import java.util.Scanner;

/**
 * Exception Handling Exercise 3:
 *
 *      Demonstrate a try/catch/finally block.
 *
 */
public class Exercise_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter a value for b: ");
        int userInput = scanner.nextInt();
        try {
            divide(userInput);
        } catch (ArithmeticException exc) {
            System.out.println("An error occurred because b cannot be zero");
        } finally {
            System.out.println("Program ended");
        }

    }

    public static void divide (int b) {
        System.out.println("10 divided by " + b + " is : " + 10 / b);
    }
}