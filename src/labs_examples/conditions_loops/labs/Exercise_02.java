package labs_examples.conditions_loops.labs;

import java.util.Scanner;

/**
 * Conditions and Loops Exercise 2: Days of the week
 *
 *      Take in a number from the user and print "Monday", "Tuesday", ... "Sunday", or "Other"
 *      if the number from the user is 1, 2,... 7, or other respectively. Use a "nested-if" statement.
 *
 */

public class Exercise_02 {

    public static void main(String[] args) {

        // 1) create scanner (don't forget to import Scanner!)
        Scanner scanner = new Scanner(System.in);
        // 2) prompt user
        System.out.print("Please enter a number between 1 and 7 inclusive: ");
        // 3) assign input to variable as int
        int num = scanner.nextInt();
        // 4) write completed code here
        if (num <= 7 & num > 0) {
            if (num > 1) {
                if (num > 2) {
                    if (num > 3) {
                        if (num > 4) {
                            if (num > 5) {
                                if (num > 6) {
                                    System.out.println("Sunday");
                                } else {
                                    System.out.println("Saturday");
                                }
                            } else {
                                System.out.println("Friday");
                            }
                        } else {
                            System.out.println("Thursday");
                        }
                    } else {
                        System.out.println("Wednesday");
                    }
                } else {
                    System.out.println("Tuesday");
                }
            } else {
                System.out.println("Monday");
            }
        } else {
            System.out.println("Error");
        }

    }

}
