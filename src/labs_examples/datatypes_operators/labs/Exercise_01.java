package labs_examples.datatypes_operators.labs;

/**
 * Data Types and Operators Exercise 1: Variable declaration and Initialization
 *
 *      Write the necessary code to complete the following:
 *
 *      1. Declare an int, a double, a float and a char
 *      2. Assign appropriate values to each
 *      3. Print out each variable to the console
 *
 *
 */

public class Exercise_01 {

    public static void main(String[] args) {

        // write code here
        int numberOfHouses;
        double surfaceArea;
        float HouseToLandRatio;
        char rating;

        numberOfHouses = 10;
        surfaceArea = 20.4545;
        HouseToLandRatio = (float)numberOfHouses / (float)surfaceArea;
        rating = 'A';

        System.out.println("The number of houses per square km on this " +surfaceArea + " square km stretch of land is " + HouseToLandRatio + " earning this location an " + rating + " star rating." );
    }
}



