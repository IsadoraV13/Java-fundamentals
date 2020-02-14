package labs_examples.arrays.labs;

/**
 *  Reversing an array in place
 *
 *
 *      This is a very common interview challenge.
 *
 *      Using a for loop, please demonstrate how to reverse an array in place using only one extra variable. Please note,
 *      you cannot use a second array and you can only instantiate one variable outside of the for loop.
 *
 */
public class Exercise_06 {
    public static void main(String[] args) {
        int array [] = {1, 2, 3, 4, 5};
        for (int j = array.length -1; j >= 0; j += -1) {
            System.out.printf("%3d", array[j]);
            // can the elements of the array be printed as is or must the output itself be an array?
        }

    }
}
