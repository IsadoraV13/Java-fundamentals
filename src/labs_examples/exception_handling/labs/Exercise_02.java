package labs_examples.exception_handling.labs;

import java.util.Scanner;

/**
 * Exception Handling Exercise 2:
 *
 *      Demonstrate a try/catch with multiple catch statements.
 *
 */

public class Exercise_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter a number, b, which will return the value in the array {1, 0, 2, 0, 3, 0} " +
                "at the index of b: ");
        int userInput = scanner.nextInt();
        try {
            demo(userInput);
        } catch (ArrayIndexOutOfBoundsException excOne) {
            System.out.println("Sorry the value of b must be less than 6. We are sorry but this program will terminate; " +
                    "please contact Support.");
        } catch (ArithmeticException excTwo) {
            System.out.println("Sorry the value of b cannot be zero. We are sorry but this program will terminate; " +
                    "please contact Support.");
        }
    }

    public static void demo(int b) {
        int [] demoArray = {1, 0, 2, 0, 3, 0};
        System.out.println("The result of this operation is: " + 1 / demoArray[b]);
    }
}

