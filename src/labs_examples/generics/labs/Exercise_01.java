package labs_examples.generics.labs;

/**
 * Generics Exercise 1:
 *
 *      1.) Write a generic class with at least two instance variables, a constructor, and getter and setter methods.
 *      2.) Create a few objects of your generic class with different data types to demonstrate it's
 *          dynamic usage.
 */

public class Exercise_01  {

    public static void main(String[] args) {
        SomeGeneric <String, Integer> item1 = new SomeGeneric<>("13", 13);
        System.out.println((item1.getObject1().getClass().getSimpleName() == item1.getObject2().getClass().getSimpleName()));

        SomeGeneric <Double, Integer> item2 = new SomeGeneric<>(13.0, 13);
        System.out.println((item2.getObject1().getClass().getSimpleName() == item2.getObject2().getClass().getSimpleName()));

    }

}

class SomeGeneric<T, N> {
    private T object1;
    private N object2;

    public SomeGeneric(T object1, N object2) {
        this.object1 = object1;
        this.object2 = object2;
    }

    public T getObject1() {
        return object1;
    }

    public void setObject1(T object1) {
        this.object1 = object1;
    }

    public N getObject2() {
        return object2;
    }

    public void setObject2(N object2) {
        this.object2 = object2;
    }

}






