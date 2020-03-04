package labs_examples.exception_handling.labs;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * Exception Handling Exercise 7:
 *
 *      1) Create a custom exception.
 *      2) Demonstrate a method throwing your custom exception.
 */

public class Exercise_07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please place your breakfast order: ");
        String customerOrder = scanner.next();
        try {
            demoException(customerOrder);
        } catch (CustomException exc) {
            System.out.println("Unfortunately the item you requested is not available. A waiter will be with you shortly.");
            System.out.println(exc.toString());
        } finally {
            System.out.println("Next customer: please press the red button to place your order.");
        }
    }

    public static void demoException(String str) throws CustomException {
        ArrayList<String> menu = new ArrayList<>();
        menu.add("egg");
        menu.add("avocado");
        menu.add("toast");
        if (menu.contains(str)) {
            System.out.println("Thank you, your order will be ready soon.");
        } else {
            throw new CustomException();
        }
    }
}

class CustomException extends Exception {
    @Override
    public String toString() {
        return "CustomException{Error: menu item unavailable}";
    }
}