package labs_examples.generics.labs;

import java.util.ArrayList;
import java.util.Collection;

/**
 * Generics Exercise 3:
 *
 *      1) Write a generic method that accepts two generic arguments. This generic method should only accept
 *      arguments which are sublasses of Number. The generic method must return the sum (as a double) of whatever two
 *      numbers were passed in regardless of their type.
 *
 *      2) Write a generic method to count the number of elements in a collection of Strings that are palindromes
 *
 *      3) Write a generic method to exchange the positions of two different elements in an array.
 *
 *      4) Write a generic method to find the largest element within the range (begin, end) of a list.
 *
 *      5)
 */

public class Exercise_03 {
    public static void main(String[] args) {
        System.out.println(sumCalculator(13, 13.45));
        System.out.println(countPalindromes("Aviva"));
    }

public static <N extends Number, T extends Number> double sumCalculator (N num1, T num2){
        double result = num1.doubleValue() + num2.doubleValue();
        return result;
    }

public static <E extends Collection> boolean countPalindromes(E collection) {
        ArrayList <String> sample = new ArrayList<>();
        for (String word : sample) {
            for (int i = 0; 1 < word.length(); i++) {
                for (int j = word.length()-1; j < word.length(); j++) {
                    if (word.charAt(i) == word.charAt(j)) {
                        System.out.println(word.charAt(i));
                        return true;
                    } else
                        break;
                }
            }

        }
        return false;
}
}