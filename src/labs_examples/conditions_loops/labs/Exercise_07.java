package labs_examples.conditions_loops.labs;

import java.util.Scanner;

/**
 * Conditions and Loops Exercise 7: First vowel
 *
 *      Take in a word from the user and using a "while" loop, find the first vowel in the word.
 *      Once you find the vowel, print out the word and the first vowel.
 *
 *      Hints:
 *          - there are a few helpful methods in the String class called length(), charAt() and indexOf()
 *          - you'll likely want to use a String that contains all the vowels:
 *              - ie: String vowels = "aeiou";
 *
 */ //fixing commit

public class Exercise_07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter any word of your choice: ");
        String word = scanner.next();
        int i = 0;
        char c;
        String vowels = "aeiou";
        while (i < word.length()) {
            c = word.charAt(i);
            if (vowels.indexOf(c) >= 0) {
                System.out.println("the first vowel in " + word + " is " + c);
                break;
            }
            i++;
        }

    }
}
