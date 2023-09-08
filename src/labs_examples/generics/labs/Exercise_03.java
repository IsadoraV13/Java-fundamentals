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
 *      2) Write a generic method to count the number of elements in a "Collection" of Strings that are palindromes

 *      3) Write a generic method to exchange the positions of two different elements in an array.
 *
 *      4) Write a generic method to find the largest element within the range (begin, end) of a list.
 *
<<<<<<< HEAD
 *      5)
 */

public class Exercise_03 {
    public static void main(String[] args) {
        System.out.println(sumCalculator(13, 13.45));

        ArrayList<String> stringArray = new ArrayList() {
            {
                add("Aviiva");
                add("Eve");
                add("eva");
            }
        };
        countElementsInPalindrome(stringArray);

        String[] exchangeString = {"breakfast", "is", "great"};
        System.out.println(exchangeElementsInArray(exchangeString));

        Integer[] exchangeInt = {0, 0, 7};
        System.out.println(exchangeElementsInArray(exchangeInt));

        String[] swapString = {"Oh", "wow"};
        System.out.println(swapTwoElementsInArray(swapString));

        Integer[] swapInt = {0, 7};
        System.out.println(swapTwoElementsInArray(swapInt));

        Integer[] findLargestInt = {77, 32, 28, 62};
        Double[] findLargestDouble = {77.7, 32.9, 28.4, 62.0};
        System.out.println(largestElementInArray(findLargestInt, 10,15));
        System.out.println(largestElementInArray(findLargestDouble, 30.0, 65.0));


    }

    public static <N extends Number, T extends Number> double sumCalculator(N num1, T num2) {
        double result = num1.doubleValue() + num2.doubleValue();
        return result;
    }

    public static <E extends Collection> int countElementsInPalindrome(E stringList) {
        String reversedWord = "";
        ArrayList<String> reversedList = new ArrayList<>();
        for (Object item : stringList) {
            String word = item.toString().toLowerCase();
            for (int i = word.length() - 1; i >= 0; i--) {
                reversedWord += word.charAt(i);
                if (word.equals(reversedWord)) { // is a palindrome
                    reversedList.add(word); // add palindrome to reversedList
                    reversedWord = "";
                }
            }
        }
        int result = reversedList.size();
        System.out.println(reversedList);
        System.out.println(result);
        return result;
    }

    public static <E> ArrayList<E> exchangeElementsInArray(E[] someArray){
        ArrayList<E> swappedArray = new ArrayList<>();
        for (int i = someArray.length - 1; i >= 0; i--) {
            swappedArray.add(someArray[i]);
        }

        return swappedArray;
    }

    public static <E> ArrayList<E> swapTwoElementsInArray(E[] someArray){
        ArrayList<E> newArray = new ArrayList<>(2);
        newArray.add(someArray[1]);
        newArray.add(someArray[0]);

        return newArray;
    }

    // didn't need an ArrayList - can just swap using indexes - defined in code (can also be defined in parameter input)
    public static <E> E[] swapTwoElementsInArrayJared(E[] someArray){
        E temp = someArray[0];
        someArray[0] = someArray[1];
        someArray[1] = temp;
        return someArray;
    }

    public static <E extends Number & Comparable> E largestElementInArray(E[] inputArray, E begin, E end) {
        // Example: {77.7, 32.9, 28.4, 62.0}
        // Thought1: find absolute max in array and then check if it's in range (if not, change to second max) -> not sure how to find max for generic
        // Thought2: check each num to see if it's in range and add to a new array, then find max - same issue as above
        // Thought3: sent the max to any number and then iterate -> Tried with Null but got NullPointerException
        // Then tried with first element of array -> but it happened to be the largest and max never changed
        // last iteration to reset max to the next element if element being iterated over is not in range

        E max = inputArray[0];
        for (int i = 0; i < inputArray.length; i++) { // assumption: range is inclusive of 'begin' and exclusive of 'end'
            if ((inputArray[i].compareTo(begin) == 1 || inputArray[i].compareTo(begin) == 0) && inputArray[i].compareTo(end) == -1) { // returns 0 for ==, -1 if element < begin,
                if (inputArray[i].compareTo(max) == 1) { // i.e. element > max
                    max = inputArray[i]; // re-assign max
                }
            } else { // if element falls outside the range, do not keep it as the max
                try {
                    if (i < inputArray.length) {
                        max = inputArray[i + 1];
                    }
                } catch(ArrayIndexOutOfBoundsException e) {
                    System.out.println("no number within range");
                    max = null; // is there a better way to do this? I tried to make this
                    break;
                }

            }
        }
        return max;

    }
}

