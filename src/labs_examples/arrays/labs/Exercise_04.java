package labs_examples.arrays.labs;

/**
 *  Irregular Arrays
 *
 *      Create and populate a 2 dimensional irregular array of size and contents of your choosing. Using a nested
 *      "for-each" loop, iterate and print out each element of the array.
 *
 */

public class Exercise_04 {
    public static void main(String[] args) {
        int [][] newArray = new int [3][5];
        int arrayCount = 0;
        for (int i = 0; i < newArray.length; i++) {
            for (int j = 0; j < newArray[i].length; j++) {
                newArray [i][j] = arrayCount +=5;
                System.out.printf("%3d", newArray [i][j]);
            }
            System.out.println();
        }

    }

}
