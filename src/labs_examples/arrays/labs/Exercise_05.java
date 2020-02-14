package labs_examples.arrays.labs;

/**
 *  Traversing Arrays Backwards
 *
 *      Please create and populate an array of your choosing. Then, please demonstrate how to print out every other
 *      element in the array in reverse order.
 *
 */

public class Exercise_05 {
    public static void main(String[] args) {
        int [] numArray = {100, 99, 98, 97, 96, 95, 94, 93, 92, 91, 90};

        for (int ii = numArray.length - 1; ii >= 0; ii += -2) {
            System.out.printf("%4d", numArray [ii]);
        }
    }
}
