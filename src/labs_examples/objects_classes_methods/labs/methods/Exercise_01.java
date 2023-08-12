package labs_examples.objects_classes_methods.labs.methods;

/**
 * Created by ryandesmond - https://codingnomads.co
 */
public class Exercise_01 {

    public static void main(String[] args) {

        // please create the methods as instructed below then
        // call each of those methods from here, within the main()
        multiply(2, 3);
        divide(2, 2);
        joke();
        yearsToSeconds(1);
        varargsMethod(1, 2, 3, 4);
    }


    // 1) Create a static multiply() method below that takes two int arguments (int a, int b) and
    //    returns the result of a * b

    static int multiply(int a, int b) {
        return a * b;
    }

    // 2) Create a static divide() method below that takes two int arguments (int a, int b) and
    //    returns the result of a / b
    static int divide(int a, int b) {
        return a / b;
    }

    // 3) Create a static void method that will print of joke of your choice to the console
    static void joke() {
        System.out.println("If i create a Java class public Class Man{}\n" +
                "Am I objectifying men?");
    }

    // 4) Create a static method that takes in a number in years (int years) as an argument
    //    and returns the number of seconds that number in years represents
    static int yearsToSeconds(int years) {
        int seconds = years * 60 * 60 * 24 * 365;
        return seconds;
    }

    // 5) Create a varargs method that will return the length of the varargs array passed in
    static int varargsMethod(int ... varArray) {
        return varArray.length;
    }

}
