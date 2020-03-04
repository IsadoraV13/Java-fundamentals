package labs_examples.exception_handling.labs;

import java.util.Scanner;

/**
 * Exception Handling Exercise 4:
 *
 *      Demonstrate a nested try/catch.
 *
 */
public class Exercise_04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter a number, b, which will return the value in the array {1, 0, 2, 0, 3, 0} " +
                "at the index of b: ");
        int userInput = scanner.nextInt();
        try {
            demo(userInput);
        } catch (ArrayIndexOutOfBoundsException excOne) {
            System.out.println("Sorry the value of b must be less than 6. Please choose a value within " +
                    "this range");
            int userInputTwo = scanner.nextInt();
            try {
                demo(userInputTwo);
            } catch (ArithmeticException excTwo) {
                System.out.println("Sorry the value of b cannot be zero either. Too many attempts; " +
                        "we are sorry but this program will terminate; please contact Support.");
            } catch (ArrayIndexOutOfBoundsException exc) {
                System.out.println("Too many attempts; we are sorry but this program will terminate; please contact Support.");
            }
        } catch (ArithmeticException excTwo) {
            System.out.println("Sorry the value of b cannot be zero. Please choose another value.");
            int userInputTwo = scanner.nextInt();
            try {
                demo(userInputTwo);
            } catch (ArrayIndexOutOfBoundsException excOne) {
                System.out.println("Sorry the value of b must be less than 6. Too many attempts; we are sorry but this " +
                        "program will terminate; please contact Support.");
            } catch (ArithmeticException exc) {
                System.out.println("Too many attempts; we are sorry but this program will terminate; please contact Support.");
            }
        }
    }

    public static void demo(int b) {
        int [] demoArray = {1, 0, 2, 0, 3, 0};
        System.out.println("The result of this operation is: " + 1 / demoArray[b]);
    }
}