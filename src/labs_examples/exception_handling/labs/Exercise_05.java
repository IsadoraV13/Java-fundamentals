package labs_examples.exception_handling.labs;

import java.util.Scanner;

/**
 * Exception Handling Exercise 5:
 *
 *      Demonstrate how to throw an exception.
 *
 */

public class Exercise_05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter the number of months you have worked: ");
        int userInput = scanner.nextInt();
        int salary = 10000;
        try {
            salaryCalc(salary, userInput);
        } catch(ArithmeticException exc) {
            System.out.println("number of months worked cannot be zero. Please start again.");
        }
    }

    public static void salaryCalc(int totalSalary, int numMonths) throws ArithmeticException {
        if (numMonths == 0)
            throw new ArithmeticException();
        System.out.println("Your monthly salary is: £" + totalSalary / numMonths);
    }
}


