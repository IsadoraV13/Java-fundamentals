package labs_examples.generics.labs;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * Generics Exercise 2:
 *
 *      Create a class with a generic method that takes in an ArrayList of any Numeric type and returns the sum of all
 *      Numbers in the ArrayList. Demonstrate how to call this method from the main() method.
 */

class Demo{
    public static void main(String[] args) {
        ArrayList<Double> someNumbers = new ArrayList<>(
                Arrays.asList(1.0, 2.0, 3.0, 4.0, 5.0));
        System.out.println(totalSum(someNumbers));
    }


    public static <E extends Number> int totalSum(ArrayList<E> numList) {
        int sum = 0;
        for (E element : numList) {
            int num = element.intValue();
            sum += num;
        }
        return sum;
    }
}