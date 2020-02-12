package labs_examples.conditions_loops.labs;

import java.util.Scanner;

/**
 * Conditions and Loops Exercise 7: First vowel
 *
 *      Take in a word from the user and using a "while" loop, find the first vowel in the word.
 *      Once you find the vowel, print out the word and the first vowel.
 *
 *      Hint: there is a helpful method in the String class called charAt() that you'll want to use
 *
 */

public class Exercise_07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter any word of your choice: ");
        String word = scanner.next();
        int i = 0;
        char [] vowel = {'a', 'o', 'e', 'i', 'u', 'y'};
        for (char letter : vowel) {
            while (word.charAt(i) != letter) {
                i++;
                break;
            }
            System.out.println(word);
            System.out.println(word.charAt(i+1));
            break;
        }

    }
}
