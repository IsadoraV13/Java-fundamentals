package labs_examples.fundamentals.labs;

/**
 * Fundamentals Exercise 4: Volume and Surface Area
 *
 *      Write the necessary code to calculate the volume and surface area of a cylinder
 *      with a radius of 3.14 and a height of 5. Print out the result.
 *
 */

public class Exercise_04 {

    public static void main(String[] args) {

        // write code here
        // I did this simple method first
        double r = 3.14;
        double h = 5;
        double vol = 3.14 * r * r * h; // have used 3.14 for pi as I do not know how to pull its value from library
        double area =  2 * 3.14 * r * h + 2 * 3.14 * r * r;

        //but then realised I could also use this method (only did if for Volume)
        double result = volume_method2(3.14, 5);

        System.out.println("volume of cylinder = " + vol + " OR with volume_method2 = " + result);
        System.out.println("area of cylinder = " + area);
    }

    public static double volume_method2(double a, double b){
        double result = 3.14 * a * a * b;
        return result;
    }
}
