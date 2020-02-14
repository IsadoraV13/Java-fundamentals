package labs_examples.arrays.labs;

import java.util.ArrayList;

/**
 *  ArrayLists
 *
 *      Please demonstrate how to create an ArrayList, populate an array list, access elements within an ArrayList.
 *      Also take a moment to explore the many methods that are available to you when you use an ArrayList. By simply
 *      typing the dot operator (".") after the ArrayList object that you create. You should see a menu pop up that
 *      shows a list of methods.
 *
 */
public class Exercise_07 {
    public static void main(String[] args) {
        // creating an ArrayList
        ArrayList<String> breakfast = new ArrayList();

        // populating it
        breakfast.add("eggs");
        breakfast.add("avocado");
        breakfast.add("toast");

        // accessing an element of the ArrayList
        System.out.println("The value at index 2 is: " + breakfast.get(2));

        // exploring dot operator
        System.out.println(breakfast.size());
        System.out.println(breakfast.contains("eggs"));
        System.out.println(breakfast.indexOf("avocado"));
        breakfast.remove("toast");
        System.out.println(breakfast);
    }
}
