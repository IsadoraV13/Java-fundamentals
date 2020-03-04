package labs_examples.enumerations.labs;

/**
 * Enumerations Exercise 1:
 *
 *      1) Create an enumeration. Use a controller class to demonstrate the use of the enum from a seperate class.
 *      2) Create a parameterized enumeration that passes one or more values to it's constructor. Demonstrate the use
 *      of this enum from a seperate class.
 */

public class Exercise_01 {
    public static void main(String[] args) {
        Menu menuToday = Menu.THU;
        System.out.println("The following is on the menu today: " + menuToday.getMain() + ", " + menuToday.getSides() + ", "
                + menuToday.getDessert() + ". ");
    }
}

